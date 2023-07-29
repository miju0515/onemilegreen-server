package mingreen.onemilegreen.Controller;


import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.RequiredArgsConstructor;
import mingreen.onemilegreen.Domain.UserRoutine;
import mingreen.onemilegreen.Service.RoutineService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/routine")
public class routineController {
    @Value("${cloud.aws.s3.bucket}")
    private  String bucket;

    private final AmazonS3Client amazonS3Client;
    private final RoutineService routineService;

    @PostMapping("/routineUploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file,int user_rou_id,String urd_content){
        try{
            String fileName = UUID.randomUUID()+"-"+file.getOriginalFilename();

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType(file.getContentType());
            metadata.setContentLength(file.getSize());

            String fileUrl=amazonS3Client.getUrl(bucket,fileName).toString();

            amazonS3Client.putObject(bucket,fileName,file.getInputStream(),metadata);

            routineService.userRoutineUpdate(user_rou_id);
            routineService.insertRoutine(fileUrl,urd_content,user_rou_id);
            routineService.addMileEffect(user_rou_id);

            return ResponseEntity.ok("인증이 완료되었습니다");
        }catch(IOException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/findAllUserRoutine")
    public List<UserRoutine> findAllUserRoutine(int rou_id){
        return routineService.findAll(rou_id);
    }

}

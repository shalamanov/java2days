package java2days.monolith.photos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotosController {

  private final PhotosService photosService;

  public PhotosController(final PhotosService photosService) {

    this.photosService = photosService;
  }

//  @GetMapping("/")
//  public
}

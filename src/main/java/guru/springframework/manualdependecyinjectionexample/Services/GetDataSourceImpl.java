package guru.springframework.manualdependecyinjectionexample.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GetDataSourceImpl implements GetDataSource {
    @Override
    public String getDS() {
        return "The base service DS!";
    }
}

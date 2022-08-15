package com.hyb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//@Setter、@Getter、@RequiredArgsConstructor、@ToString、@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;

}

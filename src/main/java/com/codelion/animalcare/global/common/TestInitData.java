package com.codelion.animalcare.global.common;

import com.codelion.animalcare.domain.diagnosis.entity.Diagnosis;
import com.codelion.animalcare.domain.diagnosis.repository.DiagnosisRepository;
import com.codelion.animalcare.domain.doctorqna.repository.QuestionRepository;
import com.codelion.animalcare.domain.hospital.entity.Hospital;
import com.codelion.animalcare.domain.hospital.repository.HospitalRepository;
import com.codelion.animalcare.domain.user.entity.Address;
import com.codelion.animalcare.domain.user.entity.Doctor;
import com.codelion.animalcare.domain.user.entity.Member;
import com.codelion.animalcare.domain.user.repository.DoctorRepository;
import com.codelion.animalcare.domain.user.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.Date;
import java.time.LocalDateTime;

@Configuration
@Profile("test")
public class TestInitData {

    @Bean
    CommandLineRunner init(MemberRepository memberRepository, DoctorRepository doctorRepository, HospitalRepository hospitalRepository, DiagnosisRepository diagnosisRepository) {
        return args -> {
            /*
            멤버 추가하는 부분입니다.
            강남역 근처로 2명
            상도 근처로 2명 잡았습니다.
             */
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            Member member1 = memberRepository.save(Member.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("member1@test.com")
                    .password(encoder.encode("member1"))
                    .name("김멤버")
                    .birthday(new Date(1995, 2, 24))
                    .address(new Address("서울 강남구 도곡동 953-11", "서울 강남구 강남대로 238", "06267", "멤버1상세주소",
                            37.4849665053325, 127.034757121285))
                    .phoneNum("01011110000")
                    .auth("ROLE_MEMBER")
                    .genderId(0)
                    .build());

            memberRepository.save(member1);

            Member member2 = memberRepository.save(Member.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("member2@test.com")
                    .password(encoder.encode("member2"))
                    .name("이멤버")
                    .birthday(new Date(1999, 5, 21))
                    .address(new Address("서울 강남구 도곡동 953-3", "서울 강남구 강남대로 242", "06267", "멤버2상세주소",
                            37.4853735070328, 127.034082861809))
                    .phoneNum("01022220000")
                    .auth("ROLE_MEMBER")
                    .genderId(1)
                    .build());
            memberRepository.save(member2);

            Member member3 = memberRepository.save(Member.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("member3@test.com")
                    .password(encoder.encode("member3"))
                    .name("최멤버")
                    .birthday(new Date(1950, 12, 1))
                    .address(new Address("서울 동작구 상도동 321-4", "서울 동작구 국사봉길 21", "07042", "멤버3상세주소",
                            37.4983449739223, 126.929376868639))
                    .phoneNum("01033330000")
                    .auth("ROLE_MEMBER")
                    .genderId(0)
                    .build());
            memberRepository.save(member3);

            Member member4 = memberRepository.save(Member.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("member4@test.com")
                    .password(encoder.encode("member4"))
                    .name("강멤버")
                    .birthday(new Date(1984, 7, 2))
                    .address(new Address("서울 동작구 상도동 321-30", "서울 동작구 국사봉길 41", "07042", "멤버4상세주소",
                            37.4978834274108, 126.930048131868))
                    .phoneNum("01044440000")
                    .auth("ROLE_MEMBER")
                    .genderId(0)
                    .build());
            memberRepository.save(member4);

            Doctor doctor1 = doctorRepository.save(Doctor.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("doctor1@test.com")
                    .password(encoder.encode("doctor1"))
                    .name("김닥터")
                    .birthday(new Date(1994, 9, 5))
                    .address(new Address("서울 강남구 도곡동 946-1", "서울 강남구 강남대로 284", "06258", "닥터1상세주소",
                            37.4887802184047, 127.032484091622))
                    .phoneNum("01011111111")
                    .auth("ROLE_DOCTOR")
                    .genderId(0)
                    .major("소동물")
                    .introduce("소동물의사 김의사입니다.")
                    .build());
            doctorRepository.save(doctor1);

            Doctor doctor2 = doctorRepository.save(Doctor.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .email("doctor2@test.com")
                    .password(encoder.encode("doctor2"))
                    .name("이닥터")
                    .birthday(new Date(1990, 10, 11))
                    .address(new Address("서울 강남구 도곡동 946-14", "서울 강남구 강남대로 282", "06258", "닥터2상세주소",
                            37.4885664092435, 127.03248411211))
                    .phoneNum("01022221111")
                    .auth("ROLE_DOCTOR")
                    .genderId(1)
                    .major("대동물")
                    .introduce("대동물의사 이의사입니다.")
                    .build());
            doctorRepository.save(doctor2);

            // 병원
            Hospital hospital1 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("제주 대학 병원")
                    .openingHours("11:00~15:00/~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/")
                    .phoneNum("01011112222")
                    .address(new Address("","제주특별자치도 서귀포시 가가로 14", "63534","101동",33.2700064530738, 126.375422332008))
                    .build();
            hospitalRepository.save(hospital1);

            Hospital hospital2 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("대박 병원")
                    .openingHours("02:57~02:57/02:57~02:57/02:57~02:58/02:58~02:58/02:58~02:58/02:58~02:58/02:58~02:58/")
                    .phoneNum("01033334444")
                    .address(new Address("경기 용인시 기흥구 구갈동 593-3", "경기 용인시 기흥구 강남동로 7", "16979","101동",37.2716680153549, 127.128387356766))
                    .build();
            hospitalRepository.save(hospital2);

            Hospital hospital3 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("제주 행복 병원")
                    .openingHours("11:00~15:00/~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/")
                    .phoneNum("01011112222")
                    .address(new Address("제주특별자치도 서귀포시 서귀동 292-2", "제주특별자치도 서귀포시 중앙로48번길 8", "63591","101동", 33.2489347597471, 126.562437759077))
                    .build();
            hospitalRepository.save(hospital3);

            Hospital hospital4 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("제주 인생 병원")
                    .openingHours("11:00~15:00/~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/")
                    .phoneNum("01011112222")
                    .address(new Address("제주특별자치도 서귀포시 남원읍 위미리 1967-1", "제주특별자치도 서귀포시 남원읍 일주동로 7624", "63591","101동", 33.2782319182411, 126.665854414504))
                    .build();
            hospitalRepository.save(hospital4);

            Hospital hospital5 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("제주 엄마 병원")
                    .openingHours("11:00~15:00/~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/")
                    .phoneNum("01011112222")
                    .address(new Address("제주특별자치도 서귀포시 상예동 4580","제주특별자치도 서귀포시 가가로 28-25", "63591","101동", 33.2709012191365, 126.375638139271))
                    .build();
            hospitalRepository.save(hospital5);

            Hospital hospital6 = Hospital.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .name("제주 아빠 병원")
                    .openingHours("11:00~15:00/~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/10:00~10:00/")
                    .phoneNum("01011112222")
                    .address(new Address("제주특별자치도 서귀포시 표선면 가시리 3665-80","제주특별자치도 서귀포시 표선면 녹산로 679-257", "63591","101동", 33.4151646324555, 126.695960005462))
                    .build();
            hospitalRepository.save(hospital6);


            // 예약서

            // 진단서

            Diagnosis diagnosis1 = Diagnosis.builder()
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .memberName("바다")
                    .addressCity("경기도 강남시")
                    .addressStreet("경기도 강남시 강남구 강남대로 1")
                    .breedingPlace("주택")
                    .animalType("강아지")
                    .animalBreed("요크셔테리어")
                    .animalName("야옹이")
                    .animalGenderId((short) 1)
                    .animalAge((short) 5)
                    .animalCoatColor("검정")
                    .animalSpecial("")
                    .diseaseName("다리 통증")
                    .diseaseDate(Date.valueOf("2022-09-14"))
                    .diagnosisDate(Date.valueOf("2022-09-15"))
                    .opinion("다리가 많이 아픔. 약 처방. 5일뒤에 또 방문 바람.")
                    .otherMatter("없음")
                    .hospitalName("제주 대박 병원")
                    .hospitalStreet("제주특별자치도 서귀포시 가가로 14")
                    .doctorName("경호")
                    .doctorLicense("0101010101")
                    // TODO .appointment() 필요하지만 아직 예약 테스트 안만들었음. 추가 예정
                    .build();

            diagnosisRepository.save(diagnosis1);

        };
    }
}

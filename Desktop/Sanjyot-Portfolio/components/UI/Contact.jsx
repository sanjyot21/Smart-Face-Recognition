import React from "react";
import { Container, Row, Col } from "reactstrap";
import Link from "next/link";
import SectionSubtitle from "./SectionSubtitle";
import classes from "../../styles/contact.module.css";
import Form from "./Form";

const Contact = () => {
  return (
    <section id="contact" className={`${classes.contact}`}>
      <Container>
        <Row>
          <Col lg="6" md="6">
            <SectionSubtitle subtitle="Contact me" />
            <h3 className="mt-4 mb-4">Contact with me</h3>

            <ul className={`${classes.contact__info__list}`}>
              <li className={`${classes.info__item}`}>
                <span>
                  <i className="ri-map-pin-line"></i>
                </span>
                <p>Chennai - India</p>
              </li>
              <li className={`${classes.info__item}`}>
                <span>
                  <i className="ri-mail-line"></i>
                </span>
                <p href="mailto:sanjyot007chatarkar@gmail.com">sanjyot007chatarkar@gmail.com</p>
              </li>
              <li className={`${classes.info__item}`}>
                <span>
                  <i className="ri-phone-line"></i>
                </span>
                <p href="https://api.whatsapp.com/send?phone=918767386018&text=Hi%20Sanjyot!">+91 87673 86018</p>
              </li>
            </ul>

            <div className={`${classes.social__links}`}>
              <Link href="https://github.com/sanjyot21">
                <i className="ri-github-line"></i>
              </Link>
              <Link href="https://www.linkedin.com/in/sanjyot-chatarkar-4a2b2a237/">
                <i className="ri-linkedin-line"></i>
              </Link>
              <Link href="https://www.instagram.com/imsanjyot_/?hl=en">
                <i className="ri-instagram-line"></i>
              </Link>
            </div>
          </Col>

          <Col lg="6" md="6">
            <Form />
          </Col>
        </Row>
      </Container>
    </section>
  );
};

export default Contact;

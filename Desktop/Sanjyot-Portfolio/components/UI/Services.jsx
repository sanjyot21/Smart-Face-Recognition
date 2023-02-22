import React from "react";
import { Container, Row, Col } from "reactstrap";
import SectionSubtitle from "./SectionSubtitle";
import classes from "../../styles/services.module.css";
import ServicesItem from "./ServicesItem";

const Services = () => {
  return (
    <section id="services">
      <Container>
        <Row>
          <Col lg="6" md="6">
            <div className={`${classes.services__container}`}>
              <div>
                <ServicesItem title="Data Analytics" icon="ri-apps-line" />

                <ServicesItem title="UI/UX Development" icon="ri-computer-line" />
              </div>

              <ServicesItem title="Web Development" icon="ri-code-s-slash-line" />
            </div>
          </Col>

          <Col lg="6" md="6" className={`${classes.service__title}`}>
            <SectionSubtitle subtitle="What I do" />
            <h3 className="mb-0 mt-4">Better Design,</h3>
            <h3 className="mb-4">Better Experience</h3>
            <p>
              Crafting visually stunning and user-friendly websites, a web designer utilizes their skills in design and technology to bring ideas to life on the web.

              Specialize in analyzing, interpreting and communicating complex data to inform decisions through advanced analytical techniques and data visualization tools.

              C++ is the best first programming language. But I have a quite good hands on HTML, CSS, JavaScript after joining the courses provided by an online platform YHILLS EDUTECH.
            </p>
          </Col>
        </Row>
      </Container>
    </section>
  );
};

export default Services;

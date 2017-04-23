# Overview

Parent project that holds module projects for the persistence of scheduler data like appointments.

The project holds backend data for scheduling appointments.

# ERD-Diagramm

The erd-diagramm for this database looks as follows: ![erd-diagramm](https://github.com/lightblueseas/scheduler-system-data/blob/develop/scheduler-system-init/src/main/resources/erd/erd-diagramm-scheduler.png)

This erd-diagramm was created with the awesome [SQuirreL SQL Client](http://squirrel-sql.sourceforge.net/)

## License

The source code comes under the liberal MIT License, making scheduler-system-data great for all types of applications for scheduling appointments.

## Build status
[![Build Status](https://travis-ci.org/lightblueseas/scheduler-system-data.svg?branch=master)](https://travis-ci.org/lightblueseas/scheduler-system-data)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/scheduler-system-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/scheduler-system-data)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~scheduler-system-data~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- scheduler-system-data version -->
		<scheduler-system-data.version>3.11.0</scheduler-system-data.version>
		<scheduler-system-business.version>${scheduler-system-data.version}</scheduler-system-business.version>
		<scheduler-system-domain.version>${scheduler-system-data.version}</scheduler-system-domain.version>
		<scheduler-system-entities.version>${scheduler-system-data.version}</scheduler-system-entities.version>
		<scheduler-system-init.version>${scheduler-system-data.version}</scheduler-system-init.version>
		<scheduler-system-rest-api.version>${scheduler-system-data.version}</scheduler-system-rest-api.version>
		<scheduler-system-rest-client.version>${scheduler-system-data.version}</scheduler-system-rest-client.version>
		<scheduler-system-rest-web.version>${scheduler-system-data.version}</scheduler-system-rest-web.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-business:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-business</artifactId>
				<version>${scheduler-system-business.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-domain:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-domain</artifactId>
				<version>${scheduler-system-domain.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-entities</artifactId>
				<version>${scheduler-system-entities.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-init:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-init</artifactId>
				<version>${scheduler-system-init.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-rest-api:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-rest-api</artifactId>
				<version>${scheduler-system-rest-api.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-rest-client:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-rest-client</artifactId>
				<version>${scheduler-system-rest-client.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of scheduler-system-rest-web:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>scheduler-system-rest-web</artifactId>
				<version>${scheduler-system-rest-web.version}</version>
			</dependency>
			...
		</dependencies>
		 
## Open Issues
[![Open Issues](https://img.shields.io/github/issues/astrapi69/scheduler-system-data.svg?style=flat)](https://github.com/astrapi69/scheduler-system-data/issues) 
		
## Want to Help and improve it? ###

The source code for scheduler-system-data are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/scheduler-system-data/fork](https://github.com/lightblueseas/scheduler-system-data/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/scheduler-system-data/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the scheduler-system-data developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/scheduler-system-data/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Fscheduler-system-data" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>

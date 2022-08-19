package main;

public class PackageFactory {

	public static Package createPackage(PackageCode packageCode) {

		switch (packageCode) {
		case STUDENT:
			return new StudentPackage();
		case TEACHER:
			return new TeacherPackage();
		case SECTIONHEAD:
			return new SectionHeadPackage();
		default:
			return null;
		}
	}
}

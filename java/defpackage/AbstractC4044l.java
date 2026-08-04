package defpackage;

/* JADX INFO: renamed from: lُُؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4044l {
    public static final C5254l yandex;

    static {
        new C5254l("multipart", "*");
        new C5254l("multipart", "mixed");
        new C5254l("multipart", "alternative");
        new C5254l("multipart", "related");
        yandex = new C5254l("multipart", "form-data");
        new C5254l("multipart", "signed");
        new C5254l("multipart", "encrypted");
        new C5254l("multipart", "byteranges");
    }
}

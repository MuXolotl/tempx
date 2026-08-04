package defpackage;

/* JADX INFO: renamed from: lَؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10133l implements InterfaceC1771l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile C10133l f20639l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15333l f20640l;

    static {
        new String(new byte[]{13, 10});
    }

    public C10133l() {
        C13698l c13698lYandex = AbstractC13675l.yandex();
        c13698lYandex.mo3668catch("IND", "Indications field");
        c13698lYandex.mo3668catch("LYR", "Lyrics multi line text");
        c13698lYandex.mo3668catch("INF", "Additional information multi line text");
        c13698lYandex.mo3668catch("AUT", "Lyrics/Music Author name");
        c13698lYandex.mo3668catch("EAL", "Extended Album name");
        c13698lYandex.mo3668catch("EAR", "Extended Artist name");
        c13698lYandex.mo3668catch("ETT", "Extended Track Title");
        c13698lYandex.mo3668catch("IMG", "Link to an image files");
        this.f20640l = c13698lYandex.metrica(true);
    }

    @Override // defpackage.InterfaceC1771l
    public final String getValue(String str) {
        return (String) this.f20640l.get(str);
    }
}

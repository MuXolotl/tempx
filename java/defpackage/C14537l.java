package defpackage;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: renamed from: lٓۥؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14537l implements InterfaceC6060l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final HashMap f28466l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final boolean f28467l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f28468l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public EnumC4474l f28469l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String[] f28470l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f28471l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int[] f28472l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String[] f28473l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String[] f28474l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String[] f28475l;

    static {
        try {
            f28467l = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f28467l = false;
        }
        HashMap map = new HashMap();
        f28466l = map;
        C2312l c2312l = new C2312l("kotlin.jvm.internal.KotlinClass");
        map.put(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()), EnumC4474l.CLASS);
        C2312l c2312l2 = new C2312l("kotlin.jvm.internal.KotlinFileFacade");
        map.put(new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub()), EnumC4474l.FILE_FACADE);
        C2312l c2312l3 = new C2312l("kotlin.jvm.internal.KotlinMultifileClass");
        map.put(new C3624l(c2312l3.loadAd(), c2312l3.yandex.mopub()), EnumC4474l.MULTIFILE_CLASS);
        C2312l c2312l4 = new C2312l("kotlin.jvm.internal.KotlinMultifileClassPart");
        map.put(new C3624l(c2312l4.loadAd(), c2312l4.yandex.mopub()), EnumC4474l.MULTIFILE_CLASS_PART);
        C2312l c2312l5 = new C2312l("kotlin.jvm.internal.KotlinSyntheticClass");
        map.put(new C3624l(c2312l5.loadAd(), c2312l5.yandex.mopub()), EnumC4474l.SYNTHETIC_CLASS);
    }

    @Override // defpackage.InterfaceC6060l
    public final InterfaceC14209l billing(C3624l c3624l, C7155l c7155l) {
        EnumC4474l enumC4474l;
        C2312l c2312lYandex = c3624l.yandex();
        if (c2312lYandex.equals(AbstractC6830l.yandex)) {
            return new C5501l(22, this);
        }
        if (c2312lYandex.equals(AbstractC6830l.adcel)) {
            return new C5008l(20, this);
        }
        if (f28467l || this.f28469l != null || (enumC4474l = (EnumC4474l) f28466l.get(c3624l)) == null) {
            return null;
        }
        this.f28469l = enumC4474l;
        return new C15053l(this);
    }
}

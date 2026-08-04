package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍؘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9365l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final String f19195l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f19196l;

    public C9365l() {
        super(0);
        StringBuilder sb = new StringBuilder("adb shell pm grant ");
        VKXApplication vKXApplication = VKXApplication.f36631l;
        sb.append((vKXApplication == null ? null : vKXApplication).getPackageName());
        sb.append(" android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER");
        this.f19195l = sb.toString();
        this.f19196l = AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final void m2640abstract(C9365l c9365l) {
        c9365l.getClass();
        AbstractC12832l.mopub(new C14050l(!((Boolean) AbstractC8619l.subs.yandex()).booleanValue(), ((Boolean) AbstractC8619l.isPro.yandex()).booleanValue()), AbstractC11990l.firebase(c9365l));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2641import(C6956l c6956l, int i) {
        c6956l.m2133new(609863934);
        int i2 = 4;
        int i3 = 2;
        int i4 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i4 & 1, (i4 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C12389l(this, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16291l.yandex((Function0) objM2132native, AbstractC14566l.amazon(626765750, new C0634l(this, i3), c6956l), null, AbstractC14566l.amazon(-203887884, new C0634l(this, 3), c6956l), AbstractC15011l.Signature, AbstractC15011l.license, AbstractC14566l.amazon(-1449868335, new C0634l(this, i2), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, 1797168, 0, 16260);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0634l(this, i, 5);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1774710809);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            if (((Boolean) this.f19196l.getValue()).booleanValue()) {
                c6956l.m2123default(637898484);
                m2641import(c6956l, i2 & 14);
            } else {
                c6956l.m2123default(634128667);
            }
            c6956l.startapp(false);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(839670443, new C10848l(c13072lYandex, this, i3), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(801564150, new C0541l(c13072lYandex, (AbstractC11801l) this, 28), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0634l(this, i, 0);
        }
    }
}

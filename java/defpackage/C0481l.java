package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* JADX INFO: renamed from: lؑٞٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0481l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C4599l f1792l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioFollowingsUpdateInfo f1793l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1794l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C1101l f1795l;

    public /* synthetic */ C0481l(AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, C4599l c4599l, C1101l c1101l, int i) {
        this.f1794l = i;
        this.f1793l = audioFollowingsUpdateInfo;
        this.f1792l = c4599l;
        this.f1795l = c1101l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1794l;
        C1101l c1101l = this.f1795l;
        C4599l c4599l = this.f1792l;
        AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = this.f1793l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex(null, AbstractC14566l.amazon(534187657, new C0481l(audioFollowingsUpdateInfo, c4599l, c1101l, i2), c6956l), c6956l, 48, 1);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l.admob(c4599l) | c6956l.admob(c1101l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new Ctry(c4599l, c1101l, 12);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC11156l.yandex(audioFollowingsUpdateInfo, (Function0) objM2132native, c6956l, 8);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

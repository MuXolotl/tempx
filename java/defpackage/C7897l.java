package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lًٍ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7897l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10507l f16468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16469l;

    public /* synthetic */ C7897l(C10507l c10507l, int i) {
        this.f16469l = i;
        this.f16468l = c10507l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16469l;
        C10507l c10507l = this.f16468l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC18643l abstractC18643l = c10507l.loadAd;
                    C10707l c10707l = AbstractC5992l.yandex;
                    AbstractC17307l.billing(abstractC18643l, 0, ((C18718l) c6956l.isPro(c10707l)).amazon, ((C18718l) c6956l.isPro(c10707l)).yandex, 0, 0.0f, false, null, null, null, c6956l, 0, 1010);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                AbstractC18643l abstractC18643l2 = c10507l.loadAd;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String loadAd = abstractC18643l2.getLoadAd();
                    boolean zBilling = c6956l2.billing(c10507l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zBilling || objM2132native == C1867l.yandex) {
                        AudioTrack audioTrack = abstractC18643l2 instanceof AudioTrack ? (AudioTrack) abstractC18643l2 : null;
                        objM2132native = audioTrack != null ? audioTrack.license() : null;
                        c6956l2.m2147try(objM2132native);
                    }
                    C10707l c10707l2 = AbstractC5992l.yandex;
                    AbstractC0133l.purchase(loadAd, (String) objM2132native, ((C18718l) c6956l2.isPro(c10707l2)).yandex, ((C18718l) c6956l2.isPro(c10707l2)).loadAd, null, c6956l2, 0, 16);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

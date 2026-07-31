package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8966l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC18643l f18492l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18493l;

    public /* synthetic */ C8966l(AbstractC18643l abstractC18643l, int i) {
        this.f18493l = i;
        this.f18492l = abstractC18643l;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.f18493l;
        AbstractC18643l abstractC18643l = this.f18492l;
        switch (i2) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(abstractC18643l.getLoadAd(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l, 0, 24960, 241662);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(abstractC18643l.getCrashlytics(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l3, 48);
                    long j = c6956l3.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC13010l.loadAd(abstractC18643l.getLoadAd(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l3, 0, 24960, 241662);
                    C6956l c6956l4 = c6956l3;
                    if (abstractC18643l instanceof AudioTrack) {
                        AudioTrack audioTrack = (AudioTrack) abstractC18643l;
                        if (audioTrack.license().length() > 0) {
                            c6956l4.m2123default(1060523749);
                            AbstractC9334l.yandex(c6956l4, AbstractC0080l.vip(c4346l, 4.0f));
                            i = 1058114398;
                            AbstractC13010l.loadAd(audioTrack.license(), null, ((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l4, 0, 24960, 241658);
                            c6956l4 = c6956l4;
                        } else {
                            i = 1058114398;
                            c6956l4.m2123default(1058114398);
                        }
                    } else {
                        i = 1058114398;
                        c6956l4.m2123default(1058114398);
                    }
                    c6956l4.startapp(false);
                    if ((abstractC18643l instanceof InterfaceC16858l) && ((InterfaceC16858l) abstractC18643l).getMetrica()) {
                        c6956l4.m2123default(1060930190);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_explicit_outline_20, 0, c6956l4), null, null, 0L, c6956l4, 56, 12);
                    } else {
                        c6956l4.m2123default(i);
                    }
                    c6956l4.startapp(false);
                    c6956l4.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd(abstractC18643l.getCrashlytics(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

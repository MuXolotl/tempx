package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7254l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3492l f15090l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15091l;

    public /* synthetic */ C7254l(C3492l c3492l, int i) {
        this.f15091l = i;
        this.f15090l = c3492l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15091l;
        C4346l c4346l = C4346l.f8873l;
        final C3492l c3492l = this.f15090l;
        final int i2 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str = c3492l.f7381l;
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(5), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 130040);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int i3 = AbstractC15548l.yandex;
                    long j = C9735l.isPro;
                    C15087l c15087lYandex = AbstractC15548l.yandex(j, 0L, 0L, 0L, c6956l2, 510);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob = c6956l2.admob(c3492l);
                    Object objM2132native = c6956l2.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zAdmob || objM2132native == c13863l) {
                        final byte b2 = b == true ? 1 : 0;
                        objM2132native = new Function0() { // from class: lٍۦٛ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = b2;
                                C3492l c3492l2 = c3492l;
                                switch (i4) {
                                    case 0:
                                        DecimalFormat decimalFormat = C15638l.yandex;
                                        C15638l.yandex(c3492l2.f7381l);
                                        c3492l2.purchase();
                                        break;
                                    default:
                                        Activity activity = c3492l2.f5081l;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", c3492l2.f7381l);
                                        intent.setFlags(1);
                                        intent.setType("text/plain");
                                        activity.startActivity(Intent.createChooser(intent, c3492l2.f5081l.getResources().getText(R.string.share)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(AbstractC1213l.yandex, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC1213l.loadAd, null, c15087lYandex, c6956l2, 24582, 428);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l2, 0, 7);
                    C15087l c15087lYandex2 = AbstractC15548l.yandex(j, 0L, 0L, 0L, c6956l2, 510);
                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob2 = c6956l2.admob(c3492l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Function0() { // from class: lٍۦٛ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4 = i2;
                                C3492l c3492l2 = c3492l;
                                switch (i4) {
                                    case 0:
                                        DecimalFormat decimalFormat = C15638l.yandex;
                                        C15638l.yandex(c3492l2.f7381l);
                                        c3492l2.purchase();
                                        break;
                                    default:
                                        Activity activity = c3492l2.f5081l;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", c3492l2.f7381l);
                                        intent.setFlags(1);
                                        intent.setType("text/plain");
                                        activity.startActivity(Intent.createChooser(intent, c3492l2.f5081l.getResources().getText(R.string.share)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13319l.yandex(AbstractC1213l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, AbstractC1213l.amazon, null, c15087lYandex2, c6956l2, 24582, 428);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6814l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14246l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6814l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f14246l = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [lؓۦۨ] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        int i = this.f14246l;
        int i2 = 1;
        int i3 = 2;
        int i4 = 5;
        int i5 = 7;
        int i6 = 3;
        int i7 = 0;
        ?? r7 = 0;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                ((C0675l) obj).f2148l.setValue(Boolean.TRUE);
                break;
            case 1:
                C0675l c0675l = (C0675l) obj;
                c0675l.getClass();
                new C17986l(C7635l.yandex, null).Signature(c0675l.isVip());
                break;
            case 2:
                C0675l c0675l2 = (C0675l) obj;
                c0675l2.getClass();
                new C17986l(C6191l.yandex, null).Signature(c0675l2.isVip());
                break;
            case 3:
                C0675l c0675l3 = (C0675l) obj;
                AbstractC9033l.loadAd(c0675l3, c0675l3.f34617l, false, new C7052l(c0675l3, (InterfaceC14029l) r7, i4));
                break;
            case 4:
                AbstractC12081l.purchase((AppActivity) ((C0675l) obj).isVip());
                break;
            case 5:
                C0675l c0675l4 = (C0675l) obj;
                c0675l4.m667public(false);
                AbstractC9033l.loadAd(c0675l4, c0675l4.isVip(), false, new C7052l(c0675l4, (InterfaceC14029l) r7, i3));
                break;
            case 6:
                C0675l c0675l5 = (C0675l) obj;
                c0675l5.m667public(false);
                c0675l5.f2153l.setValue(Boolean.TRUE);
                break;
            case 7:
                C0675l c0675l6 = (C0675l) obj;
                c0675l6.m667public(false);
                AbstractC9033l.loadAd(c0675l6, c0675l6.isVip(), false, new C7052l(c0675l6, (InterfaceC14029l) r7, i6));
                break;
            case 8:
                C0675l c0675l7 = (C0675l) obj;
                c0675l7.m667public(false);
                AbstractC9033l.crashlytics((AppActivity) c0675l7.isVip(), new C7052l(c0675l7, (InterfaceC14029l) r7, i5));
                break;
            case 9:
                C0675l c0675l8 = (C0675l) obj;
                c0675l8.getClass();
                AbstractC0085l abstractC0085l = (AbstractC0085l) ((List) AbstractC0085l.yandex.getValue()).get(!(AbstractC8182l.loadAd() instanceof C2659l) ? 1 : 0);
                c0675l8.f2148l.setValue(Boolean.FALSE);
                c0675l8.isVip().onBackPressed();
                C14967l c14967l = C14967l.purchase;
                c14967l.getClass();
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.ads();
                VKXApplication vKXApplication = VKXApplication.f36631l;
                AbstractC12832l.mopub(C17684l.yandex, vKXApplication != null ? vKXApplication : 0);
                c14967l.yandex(new C17098l(AbstractC8182l.loadAd(), abstractC0085l), true);
                break;
            case 10:
                ((C0072l) obj).mo1143default();
                break;
            case 11:
                ((C16852l) obj).mo1143default();
                break;
            case 12:
                C18381l c18381l = (C18381l) obj;
                c18381l.f35892l.invoke();
                c18381l.purchase();
                break;
            case 13:
                C18381l c18381l2 = (C18381l) obj;
                c18381l2.f35893l.invoke();
                c18381l2.purchase();
                break;
            case 14:
                C5124l c5124l = (C5124l) obj;
                c5124l.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c5124l), null, 0, new C2621l(c5124l, r7, i7), 3);
                break;
            case 15:
                C5124l c5124l2 = (C5124l) obj;
                c5124l2.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c5124l2), null, 0, new C2621l(c5124l2, r7, i2), 3);
                break;
            case 16:
                C5124l c5124l3 = (C5124l) obj;
                if (((EnumC12334l) c5124l3.f11156l.getValue()) == EnumC12334l.f24418l) {
                    C8195l c8195lM1696implements = c5124l3.m1696implements();
                    if (c8195lM1696implements != null) {
                        ((InterfaceC7042l) c8195lM1696implements.f17097l).ads(null);
                        c5124l3.m1697l(null);
                    }
                    InterfaceC17817l interfaceC17817lM2932import = c5124l3.m2932import();
                    C3086l c3086l = interfaceC17817lM2932import instanceof C3086l ? (C3086l) interfaceC17817lM2932import : null;
                    if (AbstractC8576l.yandex(c3086l != null ? c3086l.billing : null, "common")) {
                        C16076l c16076l2 = VKXApplication.f36632l;
                        if (c16076l2 == null) {
                            c16076l2 = null;
                        }
                        if (c16076l2.purchase() == EnumC11447l.f23032l) {
                            C16076l c16076l3 = VKXApplication.f36632l;
                            (c16076l3 != null ? c16076l3 : null).isPro();
                        } else {
                            C16076l c16076l4 = VKXApplication.f36632l;
                            (c16076l4 != null ? c16076l4 : null).smaato();
                        }
                    } else {
                        c5124l3.m1697l(new C8195l(null, AbstractC10999l.mopub(AbstractC11990l.firebase(c5124l3), null, 0, new C2621l(c5124l3, r7, i3), 3)));
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (((EnumC12334l) c5124l3.f11156l.getValue()) == EnumC12334l.f24420l) {
                    c5124l3.m1698l(new C6435l());
                }
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2603l.isVip((C2603l) obj);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C0113l) obj).mo1143default();
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0113l c0113l = (C0113l) obj;
                c0113l.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c0113l), null, 0, new C11671l(c0113l, r7, i4), 3);
                break;
            case 20:
                ((C6473l) obj).mo1143default();
                break;
            case 21:
                C6473l c6473l = (C6473l) obj;
                c6473l.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c6473l), null, 0, new C11671l(c6473l, r7, 6), 3);
                break;
            case 22:
                ((C12842l) obj).mo1143default();
                break;
            case 23:
                C12842l c12842l = (C12842l) obj;
                c12842l.getClass();
                AbstractC10999l.mopub(AbstractC11990l.firebase(c12842l), null, 0, new C11671l(c12842l, r7, i5), 3);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C1930l) obj).purchase();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C1930l c1930l = (C1930l) obj;
                if (c1930l.ad() != null) {
                    int i8 = AbstractC7890l.yandex;
                    AbstractC7890l.yandex(c1930l.f5081l, AbstractC11990l.firebase(c1930l), false, new C7306l(c1930l, (InterfaceC14029l) r7, 13));
                }
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C5310l) obj).mo1143default();
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C5364l) obj).mo1143default();
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C5364l c5364l = (C5364l) obj;
                AbstractC9033l.crashlytics((AppActivity) c5364l.isVip(), new C11671l(c5364l, r7, 11));
                break;
            default:
                C5364l c5364l2 = (C5364l) obj;
                c5364l2.getClass();
                C3544l c3544l = C3544l.yandex;
                C3544l.loadAd.loadAd();
                c5364l2.f11500l.setValue("");
                break;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖٖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16417l {
    public static final Map yandex;

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        C8195l c8195l = new C8195l(c2336l.loadAd(Byte.TYPE), C14244l.loadAd);
        C8195l c8195l2 = new C8195l(c2336l.loadAd(Character.TYPE), C14244l.crashlytics);
        C8195l c8195l3 = new C8195l(c2336l.loadAd(Short.TYPE), C14244l.purchase);
        C8195l c8195l4 = new C8195l(c2336l.loadAd(Integer.TYPE), C14244l.amazon);
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(InterfaceC11616l.class);
        C7577l c7577l = C7577l.subs;
        C8195l c8195l5 = new C8195l(interfaceC1388lLoadAd, c7577l);
        C8195l c8195l6 = new C8195l(c2336l.loadAd(C15729l.class), c7577l);
        C8195l c8195l7 = new C8195l(c2336l.loadAd(C17918l.class), C7577l.admob);
        InterfaceC1388l interfaceC1388lLoadAd2 = c2336l.loadAd(InterfaceC15393l.class);
        C7577l c7577l2 = C7577l.isPro;
        yandex = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, c8195l6, c8195l7, new C8195l(interfaceC1388lLoadAd2, c7577l2), new C8195l(c2336l.loadAd(C4695l.class), c7577l2), new C8195l(c2336l.loadAd(byte[].class), C7577l.crashlytics), new C8195l(c2336l.loadAd(String.class), C7577l.firebase), new C8195l(c2336l.loadAd(Long.TYPE), C7577l.mopub), new C8195l(c2336l.loadAd(Boolean.TYPE), C7577l.loadAd), new C8195l(c2336l.loadAd(Float.TYPE), C7577l.billing), new C8195l(c2336l.loadAd(Double.TYPE), C7577l.purchase), new C8195l(c2336l.loadAd(C15062l.class), C7577l.amazon));
    }

    public static final Object loadAd(C3585l c3585l, InterfaceC3327l interfaceC3327l, Function1 function1, Function1 function2, Function1 function3, Function1 function4) {
        realm_value_t realm_value_tVarIsVip;
        C11140l c11140l = C11140l.f22375l;
        int i = interfaceC3327l != null ? ((C14076l) interfaceC3327l).yandex : 0;
        switch (i == 0 ? -1 : AbstractC4779l.yandex[AbstractC5020l.inmobi(i)]) {
            case -1:
                return function1.invoke(new C14864l(c3585l.signatures()));
            case 0:
            default:
                C18725l.billing();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (AbstractC5020l.inmobi(((C14076l) interfaceC3327l).yandex)) {
                    case 0:
                        realm_value_tVarIsVip = c3585l.isVip(Long.valueOf(((C14076l) interfaceC3327l).billing()));
                        break;
                    case 1:
                        realm_value_tVarIsVip = c3585l.isPro(Boolean.valueOf(((C14076l) interfaceC3327l).yandex()));
                        break;
                    case 2:
                        realm_value_tVarIsVip = c3585l.m1360volatile(((C14076l) interfaceC3327l).firebase());
                        break;
                    case 3:
                        realm_value_tVarIsVip = c3585l.firebase(((C14076l) interfaceC3327l).loadAd());
                        break;
                    case 4:
                        realm_value_tVarIsVip = c3585l.m1356native((C15729l) ((C14076l) interfaceC3327l).admob());
                        break;
                    case 5:
                        realm_value_tVarIsVip = c3585l.subscription(Float.valueOf(((C14076l) interfaceC3327l).purchase()));
                        break;
                    case 6:
                        realm_value_tVarIsVip = c3585l.startapp(Double.valueOf(((C14076l) interfaceC3327l).amazon()));
                        break;
                    case 7:
                        realm_value_tVarIsVip = c3585l.remoteconfig(((C14076l) interfaceC3327l).crashlytics());
                        break;
                    case 8:
                        realm_value_tVarIsVip = c11140l.metrica(((C14076l) interfaceC3327l).mopub().mopub());
                        break;
                    case 9:
                        realm_value_tVarIsVip = c11140l.ads(((C4695l) ((C14076l) interfaceC3327l).isPro()).yandex);
                        break;
                    default:
                        C10754l.ads("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                        return null;
                }
                return function1.invoke(new C14864l(realm_value_tVarIsVip));
            case 11:
                return function2.invoke(interfaceC3327l);
            case 12:
                return function3.invoke(interfaceC3327l);
            case 13:
                return function4.invoke(interfaceC3327l);
        }
    }

    public static final AbstractC14507l yandex(InterfaceC1388l interfaceC1388l) {
        return (AbstractC14507l) AbstractC8676l.smaato(interfaceC1388l, yandex);
    }
}

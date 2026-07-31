package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17671l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f34439l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34440l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f34441l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17671l(C18656l c18656l, Function0 function0, int i) {
        super(2);
        this.f34440l = 2;
        this.f34439l = c18656l;
        this.f34441l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34440l;
        Object obj3 = this.f34441l;
        Object obj4 = this.f34439l;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C18666l c18666l = (C18666l) obj2;
                ViewOnAttachStateChangeListenerC0348l viewOnAttachStateChangeListenerC0348l = (ViewOnAttachStateChangeListenerC0348l) obj3;
                if (!((C11873l) obj4).loadAd.crashlytics(c18666l.billing)) {
                    viewOnAttachStateChangeListenerC0348l.admob(iIntValue, c18666l);
                    viewOnAttachStateChangeListenerC0348l.amazon();
                }
                break;
            case 1:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj4;
                interfaceC8714l.setValue(C12818l.yandex((C12818l) interfaceC8714l.getValue(), 0.0f, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), 0.0f, 9));
                ((Function1) ((InterfaceC8714l) obj3).getValue()).invoke(interfaceC8714l.getValue());
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC4523l.yandex((C18656l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                C6956l c6956l = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((C14346l) obj4).mopub.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj3;
                    c6956l.m2128goto(bool);
                    boolean zMopub = c6956l.mopub(zBooleanValue);
                    if (zBooleanValue) {
                        function2.invoke(c6956l, 0);
                    } else {
                        if (c6956l.smaato != 0) {
                            AbstractC2032l.yandex("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c6956l.f14603switch) {
                            if (zMopub) {
                                C5296l c5296l = c6956l.f14600package;
                                int i2 = c5296l.mopub;
                                int i3 = c5296l.admob;
                                C11275l c11275l = c6956l.f14597extends;
                                c11275l.getClass();
                                c11275l.amazon(false);
                                c11275l.loadAd.yandex.isPro(C3238l.amazon);
                                AbstractC15684l.yandex(i2, i3, c6956l.subscription);
                                c6956l.f14600package.tapsense();
                            } else {
                                c6956l.m2120catch();
                            }
                        }
                    }
                    if (c6956l.advert && c6956l.f14600package.subs == c6956l.isVip) {
                        c6956l.isVip = -1;
                        c6956l.advert = false;
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                InterfaceC14859l interfaceC14859l = (InterfaceC14859l) obj;
                C11925l c11925l = (C11925l) obj2;
                AbstractC18026l abstractC18026l = (AbstractC18026l) obj4;
                C3654l c3654l = abstractC18026l.f35281l;
                if (c3654l.m1389private()) {
                    abstractC18026l.f35275l = interfaceC14859l;
                    abstractC18026l.f35270l = c11925l;
                    C5227l snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).getSnapshotObserver();
                    C6148l c6148l = AbstractC18026l.f35263l;
                    snapshotObserver.yandex.crashlytics(abstractC18026l, C16274l.f31857l, (C10446l) obj3);
                    abstractC18026l.f35280l = false;
                } else {
                    abstractC18026l.f35280l = true;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17671l(Object obj, Object obj2, int i) {
        super(2);
        this.f34440l = i;
        this.f34439l = obj;
        this.f34441l = obj2;
    }
}

package defpackage;

import android.graphics.Canvas;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12683l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25001l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25002l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f25003l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f25004l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12683l(C8464l c8464l, C3654l c3654l, C8464l c8464l2) {
        super(1);
        this.f25002l = 0;
        this.f25001l = c8464l;
        this.f25003l = c3654l;
        this.f25004l = c8464l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        InterfaceC16388l interfaceC16388l;
        int i = this.f25002l;
        EnumC8647l enumC8647l = EnumC8647l.f17806l;
        boolean z = true;
        boolean zBooleanValue = false;
        byte b = 0;
        Object obj2 = this.f25003l;
        Object obj3 = this.f25004l;
        Object obj4 = this.f25001l;
        switch (i) {
            case 0:
                C8464l c8464l = (C8464l) obj4;
                C3654l c3654l = (C3654l) obj2;
                C8464l c8464l2 = (C8464l) obj3;
                InterfaceC14859l interfaceC14859lM4555synchronized = ((InterfaceC13349l) obj).mo2065break().m4555synchronized();
                if (c8464l.getView().getVisibility() != 8) {
                    c8464l.f1322l = true;
                    InterfaceC11218l interfaceC11218l = c3654l.f7680l;
                    ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = interfaceC11218l instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l ? (ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC13840l != null) {
                        Canvas canvas = AbstractC10071l.yandex;
                        Canvas canvas2 = ((C2151l) interfaceC14859lM4555synchronized).yandex;
                        if (viewTreeObserverOnGlobalLayoutListenerC13840l.f27002l != null) {
                            c8464l2.draw(canvas2);
                        }
                    }
                    c8464l.f1322l = false;
                }
                return Unit.INSTANCE;
            case 1:
                return new C15386l((C11362l) obj4, obj3, (C14931l) obj2, b == true ? 1 : 0);
            case 2:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((C17154l) obj4).loadAd.amazon.getValue()).booleanValue() ? (C8896l) obj3 : (C8896l) obj2;
            case 3:
                C8449l c8449l = (C8449l) obj;
                if (!c8449l.f29462l) {
                    return EnumC8647l.f17805l;
                }
                if (c8449l.f17456l != null) {
                    AbstractC0081l.crashlytics("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = c8449l.f17457l;
                InterfaceC18545l interfaceC18545l = function1 != null ? (InterfaceC18545l) function1.invoke((C1323l) obj4) : null;
                c8449l.f17456l = interfaceC18545l;
                byte b2 = interfaceC18545l != null;
                if (b2 != false) {
                    ((ViewOnDragListenerC13486l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp((C8449l) obj3)).m3780getDragAndDropManager()).loadAd.add(c8449l);
                }
                C9122l c9122l = (C9122l) obj2;
                if (!c9122l.f18750l && b2 == false) {
                    z = false;
                }
                c9122l.f18750l = z;
                return enumC8647l;
            case 4:
                InterfaceC11189l interfaceC11189l = (InterfaceC11189l) obj;
                C8449l c8449l2 = (C8449l) interfaceC11189l;
                if (!((ViewOnDragListenerC13486l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp((C8449l) obj3)).m3780getDragAndDropManager()).loadAd.contains(c8449l2) || !AbstractC6616l.yandex(c8449l2, AbstractC0837l.loadAd((C1323l) obj2))) {
                    return enumC8647l;
                }
                ((C10700l) obj4).f21708l = interfaceC11189l;
                return EnumC8647l.f17804l;
            case 5:
                C6543l c6543l = (C6543l) obj;
                if (!AbstractC8576l.yandex(c6543l, (C6543l) obj4)) {
                    if (AbstractC8576l.yandex(c6543l, ((C15552l) obj3).crashlytics)) {
                        C8339l.smaato("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((Function1) obj2).invoke(c6543l)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 6:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C6742l c6742l = (C6742l) obj4;
                C13601l c13601l = c6742l.f14144l;
                InterfaceC16388l interfaceC16388l2 = c6742l.f14143l;
                c6742l.f14143l = (InterfaceC16388l) obj3;
                try {
                    InterfaceC13490l interfaceC13490lM4560volatile = interfaceC13349l.mo2065break().m4560volatile();
                    EnumC9931l enumC9931lM4548native = interfaceC13349l.mo2065break().m4548native();
                    InterfaceC14859l interfaceC14859lM4555synchronized2 = interfaceC13349l.mo2065break().m4555synchronized();
                    long jM4551private = interfaceC13349l.mo2065break().m4551private();
                    C11925l c11925l = (C11925l) interfaceC13349l.mo2065break().f36009l;
                    Function1 function2 = (Function1) obj2;
                    InterfaceC13490l interfaceC13490lM4560volatile2 = c13601l.f26629l.m4560volatile();
                    EnumC9931l enumC9931lM4548native2 = c13601l.f26629l.m4548native();
                    InterfaceC14859l interfaceC14859lM4555synchronized3 = c13601l.f26629l.m4555synchronized();
                    long jM4551private2 = c13601l.f26629l.m4551private();
                    C18449l c18449l = c13601l.f26629l;
                    try {
                        C11925l c11925l2 = (C11925l) c18449l.f36009l;
                        c18449l.m4554super(interfaceC13490lM4560volatile);
                        c18449l.m4545import(enumC9931lM4548native);
                        c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                        c18449l.m4534abstract(jM4551private);
                        c18449l.f36009l = c11925l;
                        interfaceC14859lM4555synchronized2.mopub();
                        try {
                            function2.invoke(c6742l);
                            interfaceC14859lM4555synchronized2.ads();
                            C18449l c18449l2 = c13601l.f26629l;
                            c18449l2.m4554super(interfaceC13490lM4560volatile2);
                            c18449l2.m4545import(enumC9931lM4548native2);
                            c18449l2.m4544goto(interfaceC14859lM4555synchronized3);
                            c18449l2.m4534abstract(jM4551private2);
                            c18449l2.f36009l = c11925l2;
                            c6742l.f14143l = interfaceC16388l2;
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            interfaceC16388l = interfaceC16388l2;
                            try {
                                interfaceC14859lM4555synchronized2.ads();
                                C18449l c18449l3 = c13601l.f26629l;
                                c18449l3.m4554super(interfaceC13490lM4560volatile2);
                                c18449l3.m4545import(enumC9931lM4548native2);
                                c18449l3.m4544goto(interfaceC14859lM4555synchronized3);
                                c18449l3.m4534abstract(jM4551private2);
                                c18449l3.f36009l = c11925l2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                c6742l.f14143l = interfaceC16388l;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC16388l = interfaceC16388l2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC16388l = interfaceC16388l2;
                }
                break;
            case 7:
                C5371l c5371l = (C5371l) obj;
                long jLoadAd = c5371l.loadAd();
                C5056l c5056l = (C5056l) obj4;
                return Boolean.valueOf(((Boolean) c5056l.subs.invoke((C8896l) obj3, AbstractC7470l.isPro(AbstractC2296l.yandex((float) ((int) (jLoadAd >> 32)), (float) ((int) (jLoadAd & 4294967295L))), AbstractC14707l.mopub(c5371l.crashlytics())))).booleanValue() && c5056l.ads.contains(c5371l.yandex.firebase) && ((Boolean) ((Function1) obj2).invoke(c5371l)).booleanValue());
            case 8:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                AbstractC9361l.vip(interfaceC13349l2, (AbstractC9544l) obj4, 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC9361l.vip(interfaceC13349l2, (AbstractC9544l) obj3, 0L, 0L, 0.0f, null, null, 13, 62);
                long j = C9735l.crashlytics;
                AbstractC9361l.metrica(interfaceC13349l2, j, 0L, 0L, 0.0f, new C0404l(interfaceC13349l2.mo868instanceof(0.5f), 0.0f, 0, 0, null, 30), null, 0, 110);
                C12818l c12818l = (C12818l) obj2;
                long jAdmob = interfaceC13349l2.admob();
                long jYandex = AbstractC2296l.yandex(c12818l.loadAd * C14174l.billing(jAdmob), (1.0f - c12818l.crashlytics) * C14174l.crashlytics(jAdmob));
                AbstractC9361l.admob(interfaceC13349l2, C9735l.purchase, interfaceC13349l2.mo868instanceof(6.0f), jYandex, new C0404l(interfaceC13349l2.mo868instanceof(2.0f), 0.0f, 0, 0, null, 30), 104);
                AbstractC9361l.admob(interfaceC13349l2, j, interfaceC13349l2.mo868instanceof(4.0f), jYandex, new C0404l(interfaceC13349l2.mo868instanceof(1.0f), 0.0f, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
            default:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                InterfaceC18212l interfaceC18212lAmazon = abstractC9601l.amazon();
                if (interfaceC18212lAmazon != null) {
                    boolean zMo992import = ((InterfaceC7448l) obj4).mo992import();
                    C14632l c14632l = ((C11665l) obj3).f23379l;
                    if (zMo992import) {
                        c14632l.f28638l = interfaceC18212lAmazon;
                    } else {
                        c14632l.f28636l = interfaceC18212lAmazon;
                    }
                }
                abstractC9601l.mopub((AbstractC10113l) obj2, 0, 0, 0.0f);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12683l(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f25002l = i;
        this.f25001l = obj;
        this.f25004l = obj2;
        this.f25003l = obj3;
    }
}

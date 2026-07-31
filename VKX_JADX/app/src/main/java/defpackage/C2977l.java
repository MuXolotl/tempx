package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔۢؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2977l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6466l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6467l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2977l(Object obj, Object obj2, int i) {
        super(1);
        this.f6467l = i;
        this.f6468l = obj;
        this.f6466l = obj2;
    }

    private final Object yandex(Object obj) {
        C13896l c13896l = (C13896l) this.f6468l;
        ChoreographerFrameCallbackC15676l choreographerFrameCallbackC15676l = (ChoreographerFrameCallbackC15676l) this.f6466l;
        synchronized (c13896l.f27167l) {
            c13896l.f27164l.remove(choreographerFrameCallbackC15676l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        boolean z = true;
        int i = 0;
        switch (this.f6467l) {
            case 0:
                return new C11195l((InterfaceC2301l) this.f6468l, new C11029l(i, (C12095l) this.f6466l));
            case 1:
                C11195l c11195l = (C11195l) this.f6468l;
                synchronized (c11195l.crashlytics) {
                    try {
                        c11195l.purchase = true;
                        C17893l c17893l = c11195l.amazon;
                        Object[] objArr = c17893l.f34848l;
                        int i2 = c17893l.f34846l;
                        while (i < i2) {
                            InputConnectionC7023l inputConnectionC7023l = (InputConnectionC7023l) ((C4059l) objArr[i]).get();
                            if (inputConnectionC7023l != null && (inputConnection = inputConnectionC7023l.loadAd) != null) {
                                inputConnectionC7023l.yandex(inputConnection);
                                inputConnectionC7023l.loadAd = null;
                            }
                            i++;
                        }
                        c11195l.amazon.isPro();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C8877l c8877l = ((C12095l) this.f6466l).f24021l;
                c8877l.loadAd.set(null);
                c8877l.yandex.amazon();
                return Unit.INSTANCE;
            case 2:
                C11941l c11941l = (C11941l) this.f6468l;
                c11941l.setPositionProvider((InterfaceC16711l) this.f6466l);
                c11941l.ads();
                return new C2714l(2);
            case 3:
                return yandex(obj);
            case 4:
                ((Choreographer) ((C2552l) this.f6468l).f5557l).removeFrameCallback((ChoreographerFrameCallbackC15676l) this.f6466l);
                return Unit.INSTANCE;
            case 5:
                ((C3654l) this.f6468l).m1374break(((InterfaceC17242l) obj).premium((InterfaceC17242l) this.f6466l));
                return Unit.INSTANCE;
            case 6:
                ((AbstractC9601l) obj).mopub((AbstractC10113l) this.f6468l, 0, 0, ((C10405l) this.f6466l).crashlytics.admob());
                return Unit.INSTANCE;
            case 7:
                AbstractC9601l.startapp((AbstractC9601l) obj, (AbstractC10113l) this.f6468l, 0, 0, ((C1622l) this.f6466l).f3956l, 4);
                return Unit.INSTANCE;
            case 8:
                Throwable th2 = (Throwable) obj;
                C5807l c5807l = (C5807l) this.f6468l;
                if (th2 == null) {
                    c5807l.loadAd(((C11268l) this.f6466l).m3884native());
                } else if (th2 instanceof CancellationException) {
                    c5807l.crashlytics();
                } else {
                    c5807l.amazon(th2);
                }
                return Unit.INSTANCE;
            case 9:
                if (((Boolean) ((C0783l) this.f6468l).invoke((C1323l) obj)).booleanValue()) {
                    return (C12584l) this.f6466l;
                }
                return null;
            case 10:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C13601l c13601l = (C13601l) this.f6468l;
                InterfaceC13490l interfaceC13490lM4560volatile = interfaceC13349l.mo2065break().m4560volatile();
                EnumC9931l enumC9931lM4548native = interfaceC13349l.mo2065break().m4548native();
                InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
                long jM4551private = interfaceC13349l.mo2065break().m4551private();
                C11925l c11925l = (C11925l) interfaceC13349l.mo2065break().f36009l;
                Function1 function1 = (Function1) this.f6466l;
                C18449l c18449l = c13601l.f26629l;
                InterfaceC13490l interfaceC13490lM4560volatile2 = c18449l.m4560volatile();
                EnumC9931l enumC9931lM4548native2 = c18449l.m4548native();
                InterfaceC14859l interfaceC14859lM4555synchronized2 = c18449l.m4555synchronized();
                long jM4551private2 = c18449l.m4551private();
                C11925l c11925l2 = (C11925l) c18449l.f36009l;
                c18449l.m4554super(interfaceC13490lM4560volatile);
                c18449l.m4545import(enumC9931lM4548native);
                c18449l.m4544goto(interfaceC14859lM4555synchronized);
                c18449l.m4534abstract(jM4551private);
                c18449l.f36009l = c11925l;
                interfaceC14859lM4555synchronized.mopub();
                try {
                    function1.invoke(c13601l);
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14859lM4555synchronized.ads();
                    c18449l.m4554super(interfaceC13490lM4560volatile2);
                    c18449l.m4545import(enumC9931lM4548native2);
                    c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                    c18449l.m4534abstract(jM4551private2);
                    c18449l.f36009l = c11925l2;
                }
            case 11:
                MotionEvent motionEvent = (MotionEvent) obj;
                C13408l c13408l = (C13408l) this.f6466l;
                if (motionEvent.getActionMasked() == 0) {
                    C17219l c17219l = (C17219l) this.f6468l;
                    C5205l c5205l = c13408l.f26311l;
                    c17219l.f33424l = ((Boolean) (c5205l != null ? c5205l : null).invoke(motionEvent)).booleanValue() ? 2 : 3;
                } else {
                    C5205l c5205l2 = c13408l.f26311l;
                    (c5205l2 != null ? c5205l2 : null).invoke(motionEvent);
                }
                return Unit.INSTANCE;
            case 12:
                C5371l c5371l = (C5371l) obj;
                C5371l c5371l2 = (C5371l) this.f6466l;
                C5056l c5056l = (C5056l) this.f6468l;
                if (c5056l.ads.contains(c5371l.yandex.firebase)) {
                    int iInmobi = AbstractC5020l.inmobi(c5056l.mopub);
                    if (iInmobi == 0) {
                        int iOrdinal = c5056l.billing().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                C18725l.billing();
                                return null;
                            }
                            if (((int) (c5371l.loadAd() & 4294967295L)) != ((int) (c5371l2.loadAd() & 4294967295L))) {
                                z = false;
                            }
                        } else if (((int) (c5371l.loadAd() >> 32)) != ((int) (c5371l2.loadAd() >> 32))) {
                            z = false;
                        }
                    } else if (iInmobi != 1) {
                        C18725l.billing();
                        return null;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                C15730l c15730l = (C15730l) obj;
                if (!C1187l.loadAd(AbstractC3474l.subs(c15730l, false), 0L)) {
                    c15730l.yandex();
                }
                C8195l c8195lLoadAd = AbstractC2219l.loadAd(c15730l.crashlytics, ((C17249l) this.f6468l).f33476l.f9260l);
                ((Function2) this.f6466l).invoke(Float.valueOf(((Number) c8195lLoadAd.f17098l).floatValue()), Float.valueOf(((Number) c8195lLoadAd.f17097l).floatValue()));
                return Unit.INSTANCE;
            case 14:
                AbstractC9601l.startapp((AbstractC9601l) obj, (AbstractC10113l) this.f6468l, 0, 0, ((C18148l) this.f6466l).f35527l, 4);
                return Unit.INSTANCE;
            case 15:
                C11096l c11096l = (C11096l) obj;
                Function2 function2 = (Function2) this.f6466l;
                C8447l c8447l = (C8447l) this.f6468l;
                if (!c8447l.f17450l) {
                    c11096l.purchase();
                    View view = c11096l.yandex;
                    AbstractC6475l abstractC6475lLoadAd = c11096l.amazon.loadAd();
                    c8447l.f17453l = function2;
                    if (c8447l.f17454l == null) {
                        if (AbstractC8576l.yandex(Looper.myLooper(), view.getHandler().getLooper())) {
                            c8447l.f17454l = abstractC6475lLoadAd;
                            abstractC6475lLoadAd.yandex(c8447l);
                        } else {
                            view.post(new RunnableC10425l(c8447l, abstractC6475lLoadAd, 0));
                        }
                    } else if (((C5268l) abstractC6475lLoadAd).subs.yandex(EnumC8981l.f18520l)) {
                        c8447l.f17451l.premium(new C15578l(-1723985096, true, new C11834l(c11096l, c8447l, function2)));
                    }
                }
                return Unit.INSTANCE;
            default:
                ((AbstractC9601l) obj).mopub((AbstractC10113l) this.f6468l, 0, 0, ((C18133l) this.f6466l).f35445l);
                return Unit.INSTANCE;
        }
    }
}

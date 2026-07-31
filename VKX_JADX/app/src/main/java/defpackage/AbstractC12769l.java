package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12769l {
    public static final C10707l yandex = new C10707l(C16395l.f32073l);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void loadAd(InterfaceC11218l interfaceC11218l, Function2 function2, AbstractC0283l abstractC0283l) {
        C15826l c15826l;
        if (abstractC0283l instanceof C15826l) {
            c15826l = (C15826l) abstractC0283l;
            int i = c15826l.f31078l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15826l.f31078l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15826l = new C15826l(abstractC0283l);
            }
        } else {
            c15826l = new C15826l(abstractC0283l);
        }
        Object obj = c15826l.f31079l;
        int i2 = c15826l.f31078l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c15826l.f31078l = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) interfaceC11218l).m3771private(function2, c15826l);
        } else if (i2 == 1) {
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
        } else if (i2 != 2) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void yandex(InterfaceC9200l interfaceC9200l, Function2 function2, AbstractC0283l abstractC0283l) {
        C17802l c17802l;
        if (abstractC0283l instanceof C17802l) {
            c17802l = (C17802l) abstractC0283l;
            int i = c17802l.f34666l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17802l.f34666l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17802l = new C17802l(abstractC0283l);
            }
        } else {
            c17802l = new C17802l(abstractC0283l);
        }
        Object obj = c17802l.f34667l;
        int i2 = c17802l.f34666l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                AbstractC2829l.crashlytics(obj);
                C17132l.firebase();
                return;
            }
        }
        AbstractC2829l.crashlytics(obj);
        if (!((AbstractC14971l) interfaceC9200l).f29454l.f29462l) {
            C8339l.metrica("establishTextInputSession called from an unattached node");
            return;
        }
        InterfaceC11218l interfaceC11218lStartapp = AbstractC5573l.startapp(interfaceC9200l);
        C11890l c11890l = (C11890l) AbstractC5573l.metrica(interfaceC9200l).f7709l;
        c11890l.getClass();
        if (AbstractC9690l.billing(c11890l, yandex) != null) {
            C18725l.loadAd();
        } else {
            c17802l.f34666l = 1;
            loadAd(interfaceC11218lStartapp, function2, c17802l);
        }
    }
}

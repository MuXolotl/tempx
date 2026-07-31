package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0746l {
    private volatile boolean isLoadRequest;
    private volatile Object value;
    public final Function1 yandex;
    public final C4910l loadAd = AbstractC8618l.yandex();
    public final C4639l crashlytics = new C4639l(0);

    public C0746l(Function1 function1) {
        this.yandex = function1;
    }

    public static void crashlytics(C0746l c0746l) {
        C1732l c1732l = C1732l.f4136l;
        InterfaceC14029l interfaceC14029l = null;
        if (!c0746l.loadAd.mopub()) {
            AbstractC10999l.mopub(c1732l, null, 0, new C7641l(c0746l, interfaceC14029l, 13), 3);
        } else {
            c0746l.value = null;
            c0746l.loadAd.billing(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #2 {all -> 0x00bc, blocks: (B:41:0x0099, B:43:0x00a1), top: B:66:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(AbstractC0283l abstractC0283l) {
        C5607l c5607l;
        InterfaceC1601l interfaceC1601l;
        Object obj;
        int i;
        C0746l c0746l;
        InterfaceC1601l interfaceC1601l2;
        Throwable th;
        Object objInvoke;
        C0746l c0746l2;
        if (abstractC0283l instanceof C5607l) {
            c5607l = (C5607l) abstractC0283l;
            int i2 = c5607l.f11907l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5607l.f11907l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5607l = new C5607l(this, abstractC0283l);
            }
        } else {
            c5607l = new C5607l(this, abstractC0283l);
        }
        Object objInvoke2 = c5607l.f11906l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = c5607l.f11907l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objInvoke2);
            Object obj2 = this.value;
            Object obj3 = this.value;
            if (obj2 != null) {
                return obj3;
            }
            if (c5607l.f1295l.mo245l(C4639l.f9437l) != null) {
                Function1 function1 = this.yandex;
                c5607l.f11909l = null;
                c5607l.f11908l = this;
                c5607l.f11907l = 2;
                objInvoke2 = function1.invoke(c5607l);
                if (objInvoke2 != enumC9342l) {
                    c0746l = this;
                    c0746l.value = objInvoke2;
                    return this.value;
                }
            } else {
                interfaceC1601l = this.loadAd;
                c5607l.f11909l = obj3;
                c5607l.f11908l = interfaceC1601l;
                c5607l.f11905l = 0;
                c5607l.f11907l = 3;
                if (interfaceC1601l.yandex(c5607l) != enumC9342l) {
                    obj = obj3;
                    i = 0;
                    this.isLoadRequest = true;
                    if (AbstractC8576l.yandex(obj, this.value)) {
                        Function1 function2 = this.yandex;
                        c5607l.f11909l = null;
                        c5607l.f11908l = interfaceC1601l;
                        c5607l.f11911l = this;
                        c5607l.f11905l = i;
                        c5607l.f11907l = 4;
                        objInvoke = function2.invoke(c5607l);
                        if (objInvoke != enumC9342l) {
                            interfaceC1601l2 = interfaceC1601l;
                            objInvoke2 = objInvoke;
                            c0746l2 = this;
                            c0746l2.value = objInvoke2;
                            interfaceC1601l = interfaceC1601l2;
                        }
                    }
                    this.isLoadRequest = false;
                    Object obj4 = this.value;
                    interfaceC1601l.billing(null);
                    return obj4;
                }
            }
            return enumC9342l;
        }
        if (i3 == 1) {
            AbstractC2829l.crashlytics(objInvoke2);
            return objInvoke2;
        }
        if (i3 == 2) {
            c0746l = (C0746l) c5607l.f11908l;
            AbstractC2829l.crashlytics(objInvoke2);
            c0746l.value = objInvoke2;
            return this.value;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0746l2 = c5607l.f11911l;
            interfaceC1601l2 = (InterfaceC1601l) c5607l.f11908l;
            try {
                AbstractC2829l.crashlytics(objInvoke2);
                c0746l2.value = objInvoke2;
                interfaceC1601l = interfaceC1601l2;
                this.isLoadRequest = false;
                Object obj5 = this.value;
                interfaceC1601l.billing(null);
                return obj5;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.isLoadRequest = false;
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1601l = interfaceC1601l2;
                    interfaceC1601l.billing(null);
                    throw th;
                }
            }
        }
        i = c5607l.f11905l;
        InterfaceC1601l interfaceC1601l3 = (InterfaceC1601l) c5607l.f11908l;
        obj = c5607l.f11909l;
        AbstractC2829l.crashlytics(objInvoke2);
        interfaceC1601l = interfaceC1601l3;
        try {
            this.isLoadRequest = true;
            try {
                if (AbstractC8576l.yandex(obj, this.value)) {
                    Function1 function3 = this.yandex;
                    c5607l.f11909l = null;
                    c5607l.f11908l = interfaceC1601l;
                    c5607l.f11911l = this;
                    c5607l.f11905l = i;
                    c5607l.f11907l = 4;
                    objInvoke = function3.invoke(c5607l);
                    if (objInvoke != enumC9342l) {
                        interfaceC1601l2 = interfaceC1601l;
                        objInvoke2 = objInvoke;
                        c0746l2 = this;
                        c0746l2.value = objInvoke2;
                        interfaceC1601l = interfaceC1601l2;
                    }
                    return enumC9342l;
                }
                this.isLoadRequest = false;
                Object obj6 = this.value;
                interfaceC1601l.billing(null);
                return obj6;
            } catch (Throwable th4) {
                interfaceC1601l2 = interfaceC1601l;
                th = th4;
                this.isLoadRequest = false;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            interfaceC1601l.billing(null);
            throw th;
        }
    }

    public final Object purchase(C7045l c7045l, C11053l c11053l) {
        return AbstractC10999l.firebase(c11053l.f1295l.mo246l(this.crashlytics), new C2713l(this, this.value, this.isLoadRequest, c7045l, null), c11053l);
    }
}

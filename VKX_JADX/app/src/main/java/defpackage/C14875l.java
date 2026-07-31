package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lْٔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14875l {
    public final /* synthetic */ C0360l amazon;
    public final /* synthetic */ C10700l crashlytics;
    public final /* synthetic */ C9122l loadAd;
    public final /* synthetic */ InterfaceC1601l yandex;

    public C14875l(InterfaceC1601l interfaceC1601l, C9122l c9122l, C10700l c10700l, C0360l c0360l) {
        this.yandex = interfaceC1601l;
        this.loadAd = c9122l;
        this.crashlytics = c10700l;
        this.amazon = c0360l;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:21:0x004f, B:36:0x00be, B:38:0x00c6), top: B:56:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(C11797l c11797l, AbstractC0283l abstractC0283l) throws Throwable {
        C2765l c2765l;
        InterfaceC1601l interfaceC1601l;
        C9122l c9122l;
        C10700l c10700l;
        C0360l c0360l;
        int i;
        InterfaceC1601l interfaceC1601l2;
        Object obj;
        C10700l c10700l2;
        C0360l c0360l2;
        InterfaceC1601l interfaceC1601l3;
        int i2;
        int i3;
        Object obj2;
        if (abstractC0283l instanceof C2765l) {
            c2765l = (C2765l) abstractC0283l;
            int i4 = c2765l.f6000l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2765l.f6000l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2765l = new C2765l(this, abstractC0283l);
            }
        } else {
            c2765l = new C2765l(this, abstractC0283l);
        }
        Object obj3 = c2765l.f6009l;
        int i5 = c2765l.f6000l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i5 == 0) {
                AbstractC2829l.crashlytics(obj3);
                c2765l.f6005l = c11797l;
                interfaceC1601l = this.yandex;
                c2765l.f6004l = interfaceC1601l;
                C9122l c9122l2 = this.loadAd;
                c2765l.f6008l = c9122l2;
                C10700l c10700l3 = this.crashlytics;
                c2765l.f6001l = c10700l3;
                C0360l c0360l3 = this.amazon;
                c2765l.f6002l = c0360l3;
                c2765l.f6007l = 0;
                c2765l.f6000l = 1;
                if (interfaceC1601l.yandex(c2765l) != enumC9342l) {
                    c9122l = c9122l2;
                    c10700l = c10700l3;
                    c0360l = c0360l3;
                    i = 0;
                }
                return enumC9342l;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = c2765l.f6001l;
                    c10700l2 = (C10700l) c2765l.f6008l;
                    interfaceC1601l2 = c2765l.f6004l;
                    try {
                        AbstractC2829l.crashlytics(obj3);
                        c10700l2.f21708l = obj2;
                        Object obj4 = c10700l2.f21708l;
                        interfaceC1601l2.billing(null);
                        return obj4;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC1601l2.billing(null);
                        throw th;
                    }
                }
                i3 = c2765l.f6003l;
                int i6 = c2765l.f6007l;
                C0360l c0360l4 = (C0360l) c2765l.f6001l;
                C10700l c10700l4 = (C10700l) c2765l.f6008l;
                interfaceC1601l3 = c2765l.f6004l;
                try {
                    AbstractC2829l.crashlytics(obj3);
                    i2 = i6;
                    c10700l2 = c10700l4;
                    c0360l2 = c0360l4;
                    obj = obj3;
                    if (!AbstractC8576l.yandex(obj, c10700l2.f21708l)) {
                        c2765l.f6005l = null;
                        c2765l.f6004l = interfaceC1601l3;
                        c2765l.f6008l = c10700l2;
                        c2765l.f6001l = obj;
                        c2765l.f6007l = i2;
                        c2765l.f6003l = i3;
                        c2765l.f6000l = 3;
                        if (c0360l2.subs(obj, false, c2765l) != enumC9342l) {
                            obj2 = obj;
                            interfaceC1601l2 = interfaceC1601l3;
                            c10700l2.f21708l = obj2;
                        }
                        return enumC9342l;
                    }
                    interfaceC1601l2 = interfaceC1601l3;
                    Object obj5 = c10700l2.f21708l;
                    interfaceC1601l2.billing(null);
                    return obj5;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601l2 = interfaceC1601l3;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            i = c2765l.f6007l;
            C0360l c0360l5 = c2765l.f6002l;
            c10700l = (C10700l) c2765l.f6001l;
            C9122l c9122l3 = (C9122l) c2765l.f6008l;
            InterfaceC1601l interfaceC1601l4 = c2765l.f6004l;
            C11797l c11797l2 = c2765l.f6005l;
            AbstractC2829l.crashlytics(obj3);
            interfaceC1601l = interfaceC1601l4;
            c9122l = c9122l3;
            c0360l = c0360l5;
            c11797l = c11797l2;
            if (c9122l.f18750l) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj6 = c10700l.f21708l;
            c2765l.f6005l = null;
            c2765l.f6004l = interfaceC1601l;
            c2765l.f6008l = c10700l;
            c2765l.f6001l = c0360l;
            c2765l.f6002l = null;
            c2765l.f6007l = i;
            c2765l.f6003l = 0;
            c2765l.f6000l = 2;
            Object objInvoke = c11797l.invoke(obj6, c2765l);
            if (objInvoke != enumC9342l) {
                C10700l c10700l5 = c10700l;
                obj = objInvoke;
                c10700l2 = c10700l5;
                c0360l2 = c0360l;
                interfaceC1601l3 = interfaceC1601l;
                i2 = i;
                i3 = 0;
                if (!AbstractC8576l.yandex(obj, c10700l2.f21708l)) {
                    c2765l.f6005l = null;
                    c2765l.f6004l = interfaceC1601l3;
                    c2765l.f6008l = c10700l2;
                    c2765l.f6001l = obj;
                    c2765l.f6007l = i2;
                    c2765l.f6003l = i3;
                    c2765l.f6000l = 3;
                    if (c0360l2.subs(obj, false, c2765l) != enumC9342l) {
                        obj2 = obj;
                        interfaceC1601l2 = interfaceC1601l3;
                        c10700l2.f21708l = obj2;
                    }
                } else {
                    interfaceC1601l2 = interfaceC1601l3;
                }
                Object obj7 = c10700l2.f21708l;
                interfaceC1601l2.billing(null);
                return obj7;
            }
            return enumC9342l;
        } catch (Throwable th3) {
            th = th3;
            interfaceC1601l2 = interfaceC1601l;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }
}

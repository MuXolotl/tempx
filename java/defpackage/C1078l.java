package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1078l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Context f2960l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Iterator f2961l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f2962l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f2963l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Context f2964l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public /* synthetic */ Object f2965l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f2966l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC5518l f2967l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f2968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1078l(Context context, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f2960l = context;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:10:0x0029, B:43:0x0100, B:45:0x0106, B:48:0x0123, B:15:0x003f, B:42:0x00f5, B:18:0x0052, B:33:0x00ad, B:35:0x00b3, B:38:0x00d0, B:21:0x0064, B:32:0x00a3, B:28:0x007f), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:10:0x0029, B:43:0x0100, B:45:0x0106, B:48:0x0123, B:15:0x003f, B:42:0x00f5, B:18:0x0052, B:33:0x00ad, B:35:0x00b3, B:38:0x00d0, B:21:0x0064, B:32:0x00a3, B:28:0x007f), top: B:57:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:0: B:43:0x0100->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:1: B:33:0x00ad->B:66:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object c18435l;
        Throwable thYandex;
        Context context;
        C3312l c3312l;
        int i;
        int i2;
        C3312l c3312l2;
        Iterator it;
        int i3;
        int i4;
        C10532l c10532l;
        Serializable serializableLoadAd;
        C10532l c10532l2;
        Context context2;
        int i5;
        C3445l c3445l;
        C10532l c10532l3;
        Context context3;
        Iterator it2;
        int i6;
        int i7;
        C3445l c3445l2;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f2965l;
        int i8 = this.f2968l;
        int i9 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i8 == 0) {
                AbstractC2829l.crashlytics(obj);
                this.f2965l = interfaceC2262l;
                this.f2968l = 1;
                if (AbstractC8532l.purchase(1000L, this) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i8 == 1) {
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i8 == 2) {
                    i = this.f2966l;
                    i2 = this.f2962l;
                    c3312l = (C3312l) this.f2967l;
                    context = this.f2964l;
                    AbstractC2829l.crashlytics(obj);
                    c3312l2 = c3312l;
                    it = ((Iterable) obj).iterator();
                    i3 = i;
                    i4 = 0;
                    while (it.hasNext()) {
                        c3445l = (C3445l) it.next();
                        this.f2965l = null;
                        this.f2964l = context;
                        this.f2967l = c3312l2;
                        this.f2961l = it;
                        this.f2962l = i2;
                        this.f2966l = i3;
                        this.f2963l = i4;
                        this.f2968l = 3;
                        if (c3312l2.admob(context, c3445l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    c10532l = new C10532l();
                    C12183l c12183l = new C12183l(context);
                    this.f2965l = null;
                    this.f2964l = context;
                    this.f2967l = c10532l;
                    this.f2961l = null;
                    this.f2962l = i2;
                    this.f2966l = 0;
                    this.f2968l = 4;
                    serializableLoadAd = c12183l.loadAd(C10532l.class, this);
                    if (serializableLoadAd != enumC9342l) {
                        c10532l2 = c10532l;
                        obj = serializableLoadAd;
                        context2 = context;
                        i5 = 0;
                        c10532l3 = c10532l2;
                        context3 = context2;
                        it2 = ((Iterable) obj).iterator();
                        i6 = i2;
                        i7 = i5;
                    }
                    return enumC9342l;
                }
                if (i8 == 3) {
                    i4 = this.f2963l;
                    int i10 = this.f2966l;
                    int i11 = this.f2962l;
                    Iterator it3 = this.f2961l;
                    c3312l2 = (C3312l) this.f2967l;
                    Context context4 = this.f2964l;
                    AbstractC2829l.crashlytics(obj);
                    i3 = i10;
                    i2 = i11;
                    it = it3;
                    context = context4;
                    while (it.hasNext()) {
                        c3445l = (C3445l) it.next();
                        this.f2965l = null;
                        this.f2964l = context;
                        this.f2967l = c3312l2;
                        this.f2961l = it;
                        this.f2962l = i2;
                        this.f2966l = i3;
                        this.f2963l = i4;
                        this.f2968l = 3;
                        if (c3312l2.admob(context, c3445l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    c10532l = new C10532l();
                    C12183l c12183l2 = new C12183l(context);
                    this.f2965l = null;
                    this.f2964l = context;
                    this.f2967l = c10532l;
                    this.f2961l = null;
                    this.f2962l = i2;
                    this.f2966l = 0;
                    this.f2968l = 4;
                    serializableLoadAd = c12183l2.loadAd(C10532l.class, this);
                    if (serializableLoadAd != enumC9342l) {
                        c10532l2 = c10532l;
                        obj = serializableLoadAd;
                        context2 = context;
                        i5 = 0;
                        c10532l3 = c10532l2;
                        context3 = context2;
                        it2 = ((Iterable) obj).iterator();
                        i6 = i2;
                        i7 = i5;
                    }
                    return enumC9342l;
                }
                if (i8 == 4) {
                    i5 = this.f2966l;
                    i2 = this.f2962l;
                    c10532l2 = (C10532l) this.f2967l;
                    context2 = this.f2964l;
                    AbstractC2829l.crashlytics(obj);
                    c10532l3 = c10532l2;
                    context3 = context2;
                    it2 = ((Iterable) obj).iterator();
                    i6 = i2;
                    i7 = i5;
                } else {
                    if (i8 != 5) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = this.f2963l;
                    i7 = this.f2966l;
                    i6 = this.f2962l;
                    it2 = this.f2961l;
                    c10532l3 = (C10532l) this.f2967l;
                    context3 = this.f2964l;
                    AbstractC2829l.crashlytics(obj);
                    i9 = i12;
                }
            }
            while (it2.hasNext()) {
                c3445l2 = (C3445l) it2.next();
                this.f2965l = null;
                this.f2964l = context3;
                this.f2967l = c10532l3;
                this.f2961l = it2;
                this.f2962l = i6;
                this.f2966l = i7;
                this.f2963l = i9;
                this.f2968l = 5;
                if (c10532l3.admob(context3, c3445l2, this) == enumC9342l) {
                    return enumC9342l;
                }
            }
            c18435l = Unit.INSTANCE;
            thYandex = C1171l.yandex(c18435l);
            if (thYandex != null) {
                thYandex.printStackTrace();
            }
            return Unit.INSTANCE;
            context = this.f2960l;
            C3312l c3312l3 = new C3312l();
            C12183l c12183l3 = new C12183l(context);
            this.f2965l = null;
            this.f2964l = context;
            this.f2967l = c3312l3;
            this.f2962l = 0;
            this.f2966l = 0;
            this.f2968l = 2;
            Serializable serializableLoadAd2 = c12183l3.loadAd(C3312l.class, this);
            if (serializableLoadAd2 != enumC9342l) {
                c3312l = c3312l3;
                obj = serializableLoadAd2;
                i = 0;
                i2 = 0;
                c3312l2 = c3312l;
                it = ((Iterable) obj).iterator();
                i3 = i;
                i4 = 0;
                while (it.hasNext()) {
                    c3445l = (C3445l) it.next();
                    this.f2965l = null;
                    this.f2964l = context;
                    this.f2967l = c3312l2;
                    this.f2961l = it;
                    this.f2962l = i2;
                    this.f2966l = i3;
                    this.f2963l = i4;
                    this.f2968l = 3;
                    if (c3312l2.admob(context, c3445l, this) == enumC9342l) {
                    }
                }
                c10532l = new C10532l();
                C12183l c12183l4 = new C12183l(context);
                this.f2965l = null;
                this.f2964l = context;
                this.f2967l = c10532l;
                this.f2961l = null;
                this.f2962l = i2;
                this.f2966l = 0;
                this.f2968l = 4;
                serializableLoadAd = c12183l4.loadAd(C10532l.class, this);
                if (serializableLoadAd != enumC9342l) {
                    c10532l2 = c10532l;
                    obj = serializableLoadAd;
                    context2 = context;
                    i5 = 0;
                    c10532l3 = c10532l2;
                    context3 = context2;
                    it2 = ((Iterable) obj).iterator();
                    i6 = i2;
                    i7 = i5;
                    while (it2.hasNext()) {
                        c3445l2 = (C3445l) it2.next();
                        this.f2965l = null;
                        this.f2964l = context3;
                        this.f2967l = c10532l3;
                        this.f2961l = it2;
                        this.f2962l = i6;
                        this.f2966l = i7;
                        this.f2963l = i9;
                        this.f2968l = 5;
                        if (c10532l3.admob(context3, c3445l2, this) == enumC9342l) {
                        }
                    }
                    c18435l = Unit.INSTANCE;
                    thYandex = C1171l.yandex(c18435l);
                    if (thYandex != null) {
                        thYandex.printStackTrace();
                    }
                    return Unit.INSTANCE;
                }
            }
            return enumC9342l;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1078l c1078l = new C1078l(this.f2960l, interfaceC14029l);
        c1078l.f2965l = obj;
        return c1078l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1078l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}

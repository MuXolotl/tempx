package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16567l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f32521l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Comparable f32522l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f32523l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32524l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f32525l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32526l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f32527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16567l(C15035l c15035l, String str, int i, int i2, C17425l c17425l, InterfaceC14029l interfaceC14029l, int i3) {
        super(2, interfaceC14029l);
        this.f32524l = i3;
        this.f32521l = c15035l;
        this.f32522l = str;
        this.f32525l = i;
        this.f32523l = i2;
        this.f32527l = c17425l;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        int i;
        int i2;
        InterfaceC1286l interfaceC1286lStartapp;
        C13028l c13028l;
        Bitmap bitmap;
        int i3 = this.f32524l;
        Object obj2 = this.f32527l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Comparable comparable = this.f32522l;
        switch (i3) {
            case 0:
                int i4 = this.f32526l;
                try {
                    if (i4 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        int i5 = this.f32525l;
                        int i6 = this.f32523l;
                        this.f32526l = 1;
                        obj = ((C16076l) ((C15035l) this.f32521l).loadAd.get()).f31514l.yandex((String) comparable, i5, i6, this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i4 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return (C9201l) obj;
                } catch (Exception e) {
                    e.printStackTrace();
                    return C9201l.crashlytics(C2580l.f5619l, null);
                }
            case 1:
                int i7 = this.f32526l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f32526l = 1;
                    Object objInvoke = ((C15035l) this.f32521l).admob.invoke((String) comparable, new Integer(this.f32525l), new Integer(this.f32523l), (C17425l) obj2, this);
                    return objInvoke == enumC9342l ? enumC9342l : objInvoke;
                }
                if (i7 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                Uri uri = (Uri) comparable;
                C12014l c12014l = (C12014l) obj2;
                Context context = (Context) c12014l.f23941l;
                int i8 = this.f32523l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    String string = uri.toString();
                    int i9 = Build.VERSION.SDK_INT == 35 ? 1 : 0;
                    int iIntValue = i9 != 0 ? 300 : ((Number) ((C8688l) c12014l.f23943l).getValue()).intValue();
                    if (!AbstractC16648l.isVip(string, "vkx-artwork://", false) && !AbstractC16648l.isVip(string, "content://ua.itaysonlab.vkx.service.artwork/track/", false)) {
                        this.f32521l = null;
                        this.f32526l = i9;
                        this.f32525l = iIntValue;
                        this.f32523l = 3;
                        C16552l c16552l = AbstractC11463l.yandex;
                        obj = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18160l(iIntValue, null), this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                        return (Bitmap) obj;
                    }
                    C10507l c10507l = (C10507l) ((C15406l) c12014l.f23944l).invoke(AbstractC12024l.m3334new(AbstractC12024l.m3334new(uri.toString(), "vkx-artwork://"), "content://ua.itaysonlab.vkx.service.artwork/track/"));
                    AbstractC18643l abstractC18643l = c10507l != null ? c10507l.loadAd : null;
                    C13177l c13177lYandex = AbstractC2952l.yandex(context);
                    C9477l c9477l = new C9477l(context);
                    c9477l.crashlytics = abstractC18643l;
                    AbstractC10413l.yandex(c9477l, false);
                    C13767l c13767lLoadAd = c9477l.loadAd();
                    Boolean bool = Boolean.TRUE;
                    c13767lLoadAd.yandex(C12014l.f23937l, bool);
                    c9477l.loadAd().yandex(C12014l.f23938l, bool);
                    c9477l.crashlytics(iIntValue);
                    C7819l c7819lYandex = c9477l.yandex();
                    this.f32521l = null;
                    this.f32526l = i9;
                    this.f32525l = iIntValue;
                    this.f32523l = 1;
                    obj = c13177lYandex.crashlytics(c7819lYandex, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                    i = i9;
                    i2 = iIntValue;
                    interfaceC1286lStartapp = ((InterfaceC11509l) obj).startapp();
                    if (interfaceC1286lStartapp instanceof C13028l) {
                        c13028l = (C13028l) interfaceC1286lStartapp;
                    } else {
                        c13028l = null;
                    }
                    if (c13028l == null) {
                    }
                    this.f32521l = null;
                    this.f32526l = i;
                    this.f32525l = i2;
                    this.f32523l = 2;
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    obj = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18160l(i2, null), this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else if (i8 == 1) {
                    i2 = this.f32525l;
                    i = this.f32526l;
                    AbstractC2829l.crashlytics(obj);
                    interfaceC1286lStartapp = ((InterfaceC11509l) obj).startapp();
                    if (interfaceC1286lStartapp instanceof C13028l) {
                        c13028l = (C13028l) interfaceC1286lStartapp;
                    } else {
                        c13028l = null;
                    }
                    if (c13028l == null && (bitmap = c13028l.yandex) != null) {
                        return bitmap;
                    }
                    this.f32521l = null;
                    this.f32526l = i;
                    this.f32525l = i2;
                    this.f32523l = 2;
                    C16552l c16552l3 = AbstractC11463l.yandex;
                    obj = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C18160l(i2, null), this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            AbstractC2829l.crashlytics(obj);
                            return (Bitmap) obj;
                        }
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return (Bitmap) obj;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32524l;
        Object obj2 = this.f32527l;
        Comparable comparable = this.f32522l;
        switch (i) {
            case 0:
                return new C16567l((C15035l) this.f32521l, (String) comparable, this.f32525l, this.f32523l, (C17425l) obj2, interfaceC14029l, 0);
            case 1:
                return new C16567l((C15035l) this.f32521l, (String) comparable, this.f32525l, this.f32523l, (C17425l) obj2, interfaceC14029l, 1);
            default:
                C16567l c16567l = new C16567l((Uri) comparable, (C12014l) obj2, interfaceC14029l);
                c16567l.f32521l = obj;
                return c16567l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32524l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16567l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16567l(Uri uri, C12014l c12014l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f32524l = 2;
        this.f32522l = uri;
        this.f32527l = c12014l;
    }
}

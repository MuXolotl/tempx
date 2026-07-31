package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚؖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7045l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f14768l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f14769l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14770l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f14771l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f14772l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f14773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7045l(ClassLoader classLoader, String str, C14187l c14187l, C13046l c13046l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f14771l = 1;
        this.f14768l = classLoader;
        this.f14769l = str;
        this.f14772l = c14187l;
        this.f14770l = c13046l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        C16864l c16864l;
        Function2 function2;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.f14771l;
        Object obj2 = this.f14770l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj3 = this.f14772l;
        switch (i) {
            case 0:
                AbstractC10022l abstractC10022l = (AbstractC10022l) obj2;
                C5808l c5808l = (C5808l) obj3;
                int i2 = this.f14773l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Function2 function3 = c5808l.yandex;
                    c16864l = abstractC10022l.loadAd().f27847l;
                    C0746l c0746l = c5808l.crashlytics;
                    this.f14768l = function3;
                    this.f14769l = c16864l;
                    this.f14773l = 1;
                    Object objAmazon = c0746l.amazon(this);
                    if (objAmazon != enumC9342l) {
                        function2 = function3;
                        obj = objAmazon;
                    }
                    return enumC9342l;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c16864l = (C16864l) this.f14769l;
                function2 = (Function2) this.f14768l;
                AbstractC2829l.crashlytics(obj);
                C0867l c0867l = new C0867l(c16864l, (C2855l) obj);
                this.f14768l = null;
                this.f14769l = null;
                this.f14773l = 2;
                Object objInvoke = function2.invoke(c0867l, this);
                if (objInvoke != enumC9342l) {
                    return objInvoke;
                }
                return enumC9342l;
            case 1:
                int i3 = this.f14773l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC1452l interfaceC1452l = (InterfaceC1452l) ((C13046l) obj2).isPro.getValue();
                    this.f14773l = 1;
                    if (AbstractC5941l.license((ClassLoader) this.f14768l, (String) this.f14769l, (C14187l) obj3, interfaceC1452l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C16220l c16220l = (C16220l) obj3;
                File file = c16220l.yandex;
                int i4 = this.f14773l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            InterfaceC18477l interfaceC18477l = c16220l.loadAd;
                            C16145l c16145l = new C16145l(5, fileOutputStream3);
                            this.f14768l = fileOutputStream3;
                            this.f14769l = fileOutputStream3;
                            this.f14773l = 1;
                            if (interfaceC18477l.mo2332l(c16145l, obj2) == enumC9342l) {
                                return enumC9342l;
                            }
                            fileOutputStream = fileOutputStream3;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw AbstractC11020l.crashlytics(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.f14769l;
                    fileOutputStream = (FileOutputStream) this.f14768l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            AbstractC7876l.loadAd(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Unit unit = Unit.INSTANCE;
                AbstractC7876l.loadAd(fileOutputStream, null);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f14771l;
        Object obj = this.f14770l;
        Object obj2 = this.f14772l;
        switch (i) {
            case 0:
                return new C7045l((C5808l) obj2, (AbstractC10022l) obj, interfaceC14029l, 0);
            case 1:
                return new C7045l((ClassLoader) this.f14768l, (String) this.f14769l, (C14187l) obj2, (C13046l) obj, interfaceC14029l);
            default:
                return new C7045l((C16220l) obj2, obj, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f14771l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C7045l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7045l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f14771l = i;
        this.f14772l = obj;
        this.f14770l = obj2;
    }
}

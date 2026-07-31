package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٌُۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10928l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f22045l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f22046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22047l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f22048l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22049l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928l(C0360l c0360l, InterfaceC8282l interfaceC8282l, InterfaceC12932l interfaceC12932l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f22047l = 2;
        this.f22045l = c0360l;
        this.f22046l = interfaceC12932l;
        this.f22048l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Object obj2;
        InterfaceC8282l interfaceC8282l;
        C6394l c6394l;
        C9426l c9426l;
        C9426l c9426l2;
        Object objFirebase;
        Throwable thYandex;
        boolean zM2649l;
        long jTapsense;
        String str;
        Object objMo2330l;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        int i = this.f22047l;
        int i2 = 3;
        int i3 = 2;
        Object obj3 = this.f22048l;
        ?? r4 = "call to 'resume' before 'invoke' with coroutine";
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C18221l c18221l = null;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                Object obj4 = this.f22046l;
                C15389l c15389l = (C15389l) this.f22045l;
                int i4 = this.f22049l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    ((C10086l) c15389l.purchase).setValue(obj4);
                    C9501l c9501l = new C9501l(c15389l, i2);
                    C7641l c7641l = new C7641l((Function4) obj3, c15389l, z ? 1 : 0, 4);
                    this.f22049l = 1;
                    if (AbstractC12019l.loadAd(c9501l, c7641l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                if (((Boolean) ((Function1) c15389l.yandex).invoke(obj4)).booleanValue()) {
                    ((C14061l) c15389l.firebase).yandex(c15389l.subs().billing(obj4), ((C13765l) c15389l.isPro).admob());
                    ((C10086l) c15389l.amazon).setValue(obj4);
                    c15389l.remoteconfig(obj4);
                }
                return Unit.INSTANCE;
            case 1:
                C0360l c0360l = (C0360l) this.f22046l;
                int i5 = this.f22049l;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            AbstractC2829l.crashlytics(obj);
                            obj2 = obj;
                        } else {
                            if (i5 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c9426l2 = (C9426l) this.f22045l;
                            try {
                                AbstractC2829l.crashlytics(obj);
                                objFirebase = obj;
                            } catch (Throwable th2) {
                                th = th2;
                                objFirebase = new C18435l(th);
                            }
                        }
                        thYandex = C1171l.yandex(objFirebase);
                        if (thYandex == null) {
                            zM2649l = c9426l2.m3885new(objFirebase);
                        } else {
                            zM2649l = c9426l2.m2649l(thYandex);
                        }
                        return Boolean.valueOf(zM2649l);
                    }
                    AbstractC2829l.crashlytics(obj);
                    this.f22049l = 1;
                    obj2 = null;
                    InterfaceC12932l interfaceC12932lMo246l = c6394l.amazon.mo246l(this.f1295l);
                    C6637l c6637l = new C6637l(c0360l, c6394l, interfaceC8282l, (InterfaceC14029l) null);
                    this.f22045l = c9426l;
                    this.f22049l = 2;
                    objFirebase = AbstractC10999l.firebase(interfaceC12932lMo246l, c6637l, this);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                    c9426l2 = c9426l;
                    thYandex = C1171l.yandex(objFirebase);
                    if (thYandex == null) {
                        zM2649l = c9426l2.m3885new(objFirebase);
                    } else {
                        zM2649l = c9426l2.m2649l(thYandex);
                    }
                    return Boolean.valueOf(zM2649l);
                } catch (Throwable th3) {
                    th = th3;
                    c9426l2 = c9426l;
                    objFirebase = new C18435l(th);
                }
                interfaceC8282l = (InterfaceC8282l) obj2;
                c6394l = (C6394l) obj3;
                c9426l = c6394l.loadAd;
                break;
            case 2:
                C0360l c0360l2 = (C0360l) this.f22045l;
                int i6 = this.f22049l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C2588l c2588l = new C2588l(c0360l2, (InterfaceC12932l) this.f22046l, (Function2) obj3, null);
                this.f22049l = 1;
                Object objAds = AbstractC5088l.ads(c2588l, this);
                return objAds == enumC9342l ? enumC9342l : objAds;
            case 3:
                C13046l c13046l = (C13046l) this.f22045l;
                int i7 = this.f22049l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C18396l c18396lM1204l = ((C2494l) c13046l.crashlytics.f20466l).m1204l("ktor.application.startupTimeoutMillis");
                    if (c18396lM1204l == null || (str = (String) ((Map) c18396lM1204l.f35933l).get((String) c18396lM1204l.f35934l)) == null) {
                        C6760l c6760l = C9658l.f19699l;
                        jTapsense = AbstractC15918l.tapsense(10, EnumC16636l.SECONDS);
                    } else {
                        long j = Long.parseLong(str);
                        C6760l c6760l2 = C9658l.f19699l;
                        jTapsense = AbstractC15918l.Signature(j, EnumC16636l.MILLISECONDS);
                    }
                    C4647l c4647l = new C4647l(c13046l, (C14187l) this.f22046l, (ClassLoader) obj3, (InterfaceC14029l) null, 10);
                    this.f22049l = 1;
                    if (AbstractC15342l.mopub(jTapsense, c4647l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                C9685l c9685l = (C9685l) obj3;
                InterfaceC18477l interfaceC18477l = c9685l.loadAd;
                File file = c9685l.yandex;
                int i8 = this.f22049l;
                try {
                    try {
                        try {
                            if (i8 == 0) {
                                AbstractC2829l.crashlytics(obj);
                                FileInputStream fileInputStream3 = new FileInputStream(file);
                                this.f22045l = fileInputStream3;
                                this.f22046l = null;
                                this.f22049l = 1;
                                objMo2330l = interfaceC18477l.mo2331l(fileInputStream3);
                                r4 = fileInputStream3;
                                if (objMo2330l == enumC9342l) {
                                    return enumC9342l;
                                }
                            } else {
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    fileInputStream2 = (FileInputStream) this.f22046l;
                                    try {
                                        AbstractC2829l.crashlytics(obj);
                                        objMo2330l = obj;
                                        AbstractC7876l.loadAd(fileInputStream2, null);
                                        return objMo2330l;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileInputStream = fileInputStream2;
                                        th = th;
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            AbstractC7876l.loadAd(fileInputStream, th);
                                            throw th5;
                                        }
                                    }
                                }
                                FileInputStream fileInputStream4 = (FileInputStream) this.f22045l;
                                AbstractC2829l.crashlytics(obj);
                                objMo2330l = obj;
                                r4 = fileInputStream4;
                            }
                            AbstractC7876l.loadAd(r4, null);
                            break;
                        } catch (FileNotFoundException unused) {
                            if (file.exists()) {
                                fileInputStream = new FileInputStream(file);
                                try {
                                    this.f22045l = null;
                                    this.f22046l = fileInputStream;
                                    this.f22049l = 2;
                                    objMo2330l = interfaceC18477l.mo2331l(fileInputStream);
                                    if (objMo2330l == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    fileInputStream2 = fileInputStream;
                                    AbstractC7876l.loadAd(fileInputStream2, null);
                                } catch (Throwable th6) {
                                    th = th6;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                objMo2330l = interfaceC18477l.mo2330l();
                            }
                            return objMo2330l;
                        }
                        return objMo2330l;
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw AbstractC11020l.crashlytics(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } catch (Throwable th7) {
                    ?? r7 = r4;
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        AbstractC7876l.loadAd(r7, th7);
                        throw th8;
                    }
                }
            case 5:
                int i9 = this.f22049l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C3399l c3399l = (C3399l) this.f22045l;
                    SessionWorker sessionWorker = (SessionWorker) this.f22046l;
                    Context context = sessionWorker.yandex;
                    C4043l c4043l = (C4043l) obj3;
                    C15428l c15428l = sessionWorker.subs;
                    C5146l c5146l = new C5146l(sessionWorker);
                    this.f22049l = 1;
                    if (AbstractC3234l.crashlytics(c3399l, context, c4043l, c15428l, c5146l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return new C0233l(C4279l.loadAd);
            case 6:
                C13954l c13954l = (C13954l) obj3;
                EnumC11011l enumC11011l = (EnumC11011l) this.f22046l;
                C15178l c15178l = (C15178l) this.f22045l;
                int i10 = this.f22049l;
                EnumC11011l enumC11011l2 = EnumC11011l.f22180l;
                try {
                    if (i10 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        if (c15178l.yandex || enumC11011l == EnumC11011l.f22181l) {
                            this.f22049l = 1;
                            if (c13954l.invoke(this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C11671l c11671l = new C11671l(c13954l, z2 ? 1 : 0, i3);
                            this.f22049l = 2;
                            if (AbstractC15342l.billing(1500L, c11671l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    } else {
                        if (i10 != 1 && i10 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    if (enumC11011l != enumC11011l2) {
                        c15178l.yandex();
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th9) {
                    if (enumC11011l != enumC11011l2) {
                        c15178l.yandex();
                    }
                    throw th9;
                }
            case 7:
                int i11 = this.f22049l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f22049l = 1;
                    Object objSmaato = C6267l.smaato((C6267l) this.f22045l, EnumC17911l.f34869l, (Map) this.f22046l, (EnumC10534l) obj3, this);
                    return objSmaato == enumC9342l ? enumC9342l : objSmaato;
                }
                if (i11 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                C6267l c6267l = (C6267l) this.f22045l;
                int i12 = this.f22049l;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap = c6267l.firebase;
                C9426l c9426l3 = C6267l.smaato;
                C16443l c16443l = (C16443l) this.f22046l;
                C10685l c10685l = new C10685l(3);
                c10685l.m2950default(c16443l);
                linkedHashMap.put(EnumC17911l.f34868l, new C13467l(c10685l, new LinkedHashMap((Map) obj3), c18221l, 12));
                C13467l c13467lRemoteconfig = C6267l.remoteconfig(c6267l.firebase);
                this.f22049l = 1;
                Object objMetrica = c6267l.metrica(c13467lRemoteconfig, null, this);
                return objMetrica == enumC9342l ? enumC9342l : objMetrica;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f22047l;
        Object obj = this.f22048l;
        switch (i) {
            case 0:
                return new C10928l((C15389l) this.f22045l, this.f22046l, (Function4) obj, interfaceC14029l, 0);
            case 1:
                return new C10928l((C0360l) this.f22046l, (C6394l) obj, interfaceC14029l);
            case 2:
                return new C10928l((C0360l) this.f22045l, (InterfaceC8282l) null, (InterfaceC12932l) this.f22046l, (Function2) obj, interfaceC14029l);
            case 3:
                return new C10928l((C13046l) this.f22045l, (C14187l) this.f22046l, (ClassLoader) obj, interfaceC14029l, 3);
            case 4:
                return new C10928l((C9685l) obj, interfaceC14029l);
            case 5:
                return new C10928l((C3399l) this.f22045l, (SessionWorker) this.f22046l, (C4043l) obj, interfaceC14029l, 5);
            case 6:
                return new C10928l((C15178l) this.f22045l, (EnumC11011l) this.f22046l, (C13954l) obj, interfaceC14029l, 6);
            case 7:
                return new C10928l((C6267l) this.f22045l, (Map) this.f22046l, (EnumC10534l) obj, interfaceC14029l, 7);
            default:
                return new C10928l((C6267l) this.f22045l, (C16443l) this.f22046l, (Map) obj, interfaceC14029l, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f22047l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((C10928l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928l(C0360l c0360l, C6394l c6394l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f22047l = 1;
        this.f22046l = c0360l;
        this.f22048l = c6394l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928l(C9685l c9685l, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f22047l = 4;
        this.f22048l = c9685l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10928l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f22047l = i;
        this.f22045l = obj;
        this.f22046l = obj2;
        this.f22048l = obj3;
    }
}

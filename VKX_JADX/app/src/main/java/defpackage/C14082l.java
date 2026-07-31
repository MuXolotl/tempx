package defpackage;

import android.util.Log;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lُٓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14082l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f27436l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f27437l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27438l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f27439l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27440l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14082l(C2375l c2375l, C10987l c10987l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f27438l = 0;
        this.f27437l = c2375l;
        this.f27439l = c10987l;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:235:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:245:0x0500  */
    /* JADX WARN: Code duplicated, block: B:248:0x0551  */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Instruction removed from duplicated block: B:248:0x0551, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Object objLicense;
        C10954l c10954l;
        Object objYandex;
        Object c18435l;
        C17535l attributes;
        Object objAmazon;
        Object c18435l2;
        Object objLoadAd;
        Object objYandex2;
        byte b;
        InterfaceC6942l interfaceC6942lYandex;
        C11310l c11310l;
        Object objInvoke;
        int i = this.f27438l;
        int i2 = 3;
        int i3 = 5;
        int i4 = 0;
        int i5 = 2;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        switch (i) {
            case 0:
                int i6 = this.f27440l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C14061l c14061l = (C14061l) this.f27436l;
                    C2375l c2375l = (C2375l) this.f27437l;
                    C0464l c0464l = new C0464l((C10987l) this.f27439l, c14061l, 5);
                    this.f27440l = 1;
                    if (c2375l.invoke(c0464l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                C9591l c9591l = (C9591l) this.f27436l;
                C7784l c7784l = (C7784l) this.f27437l;
                int i7 = this.f27440l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C18163l c18163l = (C18163l) this.f27439l;
                    this.f27436l = null;
                    this.f27437l = null;
                    this.f27440l = 1;
                    Object objFirebase = AbstractC10999l.firebase(c18163l.admob, new C0469l(c18163l, c7784l, c9591l, (InterfaceC14029l) null, 4), this);
                    if (objFirebase != enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == enumC9342l) {
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
            case 2:
                AbstractC12074l abstractC12074l = (AbstractC12074l) this.f27437l;
                Object obj2 = this.f27439l;
                int i8 = this.f27440l;
                int i9 = 4;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            objYandex = obj;
                            objLicense = AbstractC12311l.smaato(0, 14, (String) objYandex);
                            if (objLicense != null) {
                                InterfaceC6272l interfaceC6272l = AbstractC12761l.yandex;
                                StringBuilder sb = new StringBuilder("Transformed ");
                                Class<?> cls = obj2.getClass();
                                C2336l c2336l = AbstractC18202l.yandex;
                                sb.append(c2336l.loadAd(cls));
                                sb.append(" to ");
                                sb.append(c2336l.loadAd(objLicense.getClass()));
                                sb.append(" for ");
                                sb.append(AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                                interfaceC6272l.vip(sb.toString());
                                this.f27437l = null;
                                this.f27439l = null;
                                this.f27436l = null;
                                this.f27440l = 5;
                                if (abstractC12074l.purchase(this, objLicense) == enumC9342l) {
                                    return enumC9342l;
                                }
                            } else {
                                AbstractC12761l.yandex.vip("No Default Transformations found for " + AbstractC18202l.yandex.loadAd(obj2.getClass()) + " and expected type " + AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l.f24000l) + " for call " + AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                                Unit unit = Unit.INSTANCE;
                            }
                        } else if (i8 == 3) {
                            c10954l = (C10954l) this.f27436l;
                            AbstractC2829l.crashlytics(obj);
                            objLicense = c10954l.build();
                            if (objLicense != null) {
                                InterfaceC6272l interfaceC6272l2 = AbstractC12761l.yandex;
                                StringBuilder sb2 = new StringBuilder("Transformed ");
                                Class<?> cls2 = obj2.getClass();
                                C2336l c2336l2 = AbstractC18202l.yandex;
                                sb2.append(c2336l2.loadAd(cls2));
                                sb2.append(" to ");
                                sb2.append(c2336l2.loadAd(objLicense.getClass()));
                                sb2.append(" for ");
                                sb2.append(AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                                interfaceC6272l2.vip(sb2.toString());
                                this.f27437l = null;
                                this.f27439l = null;
                                this.f27436l = null;
                                this.f27440l = 5;
                                if (abstractC12074l.purchase(this, objLicense) == enumC9342l) {
                                    return enumC9342l;
                                }
                            } else {
                                AbstractC12761l.yandex.vip("No Default Transformations found for " + AbstractC18202l.yandex.loadAd(obj2.getClass()) + " and expected type " + AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l.f24000l) + " for call " + AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                                Unit unit2 = Unit.INSTANCE;
                            }
                        } else if (i8 != 4) {
                            if (i8 != 5) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                        }
                    }
                    AbstractC2829l.crashlytics(obj);
                    objLicense = obj;
                    if (objLicense != null) {
                        InterfaceC6272l interfaceC6272l3 = AbstractC12761l.yandex;
                        StringBuilder sb3 = new StringBuilder("Transformed ");
                        Class<?> cls3 = obj2.getClass();
                        C2336l c2336l3 = AbstractC18202l.yandex;
                        sb3.append(c2336l3.loadAd(cls3));
                        sb3.append(" to ");
                        sb3.append(c2336l3.loadAd(objLicense.getClass()));
                        sb3.append(" for ");
                        sb3.append(AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                        interfaceC6272l3.vip(sb3.toString());
                        this.f27437l = null;
                        this.f27439l = null;
                        this.f27436l = null;
                        this.f27440l = 5;
                        if (abstractC12074l.purchase(this, objLicense) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        AbstractC12761l.yandex.vip("No Default Transformations found for " + AbstractC18202l.yandex.loadAd(obj2.getClass()) + " and expected type " + AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l.f24000l) + " for call " + AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                        Unit unit3 = Unit.INSTANCE;
                    }
                } else {
                    AbstractC2829l.crashlytics(obj);
                    boolean z = obj2 instanceof InterfaceC9354l;
                    InterfaceC9354l interfaceC9354l = z ? (InterfaceC9354l) obj2 : null;
                    if (interfaceC9354l == null) {
                        return Unit.INSTANCE;
                    }
                    Object obj3 = abstractC12074l.f24000l;
                    InterfaceC1388l interfaceC1388l = AbstractC11626l.yandex((InterfaceC9955l) obj3).yandex;
                    C2336l c2336l4 = AbstractC18202l.yandex;
                    if (AbstractC8576l.yandex(interfaceC1388l, c2336l4.loadAd(InterfaceC9354l.class))) {
                        objLicense = null;
                    } else if (AbstractC8576l.yandex(interfaceC1388l, c2336l4.loadAd(byte[].class))) {
                        this.f27437l = abstractC12074l;
                        this.f27439l = obj2;
                        this.f27440l = 1;
                        objLicense = AbstractC10310l.m2911throws(interfaceC9354l, this);
                        if (objLicense == enumC9342l) {
                            return enumC9342l;
                        }
                    } else if (AbstractC8576l.yandex(interfaceC1388l, c2336l4.loadAd(InterfaceC14665l.class))) {
                        InterfaceC9955l interfaceC9955l = (InterfaceC9955l) obj3;
                        try {
                            C5254l c5254lYandex = AbstractC7000l.yandex(((InterfaceC9955l) obj3).billing());
                            if (c5254lYandex.m1754l(AbstractC14192l.crashlytics)) {
                                Charset charsetYandex = AbstractC15755l.yandex(AbstractC7000l.yandex(interfaceC9955l.billing()));
                                if (charsetYandex == null) {
                                    charsetYandex = AbstractC9050l.yandex;
                                }
                                this.f27437l = abstractC12074l;
                                this.f27439l = obj2;
                                this.f27440l = 2;
                                objYandex = AbstractC12761l.yandex(interfaceC9354l, charsetYandex, this);
                                if (objYandex == enumC9342l) {
                                    return enumC9342l;
                                }
                                objLicense = AbstractC12311l.smaato(0, 14, (String) objYandex);
                            } else if (c5254lYandex.m1754l(AbstractC4044l.yandex)) {
                                C6928l c6928l = InterfaceC14665l.loadAd;
                                C10954l c10954l2 = new C10954l(13);
                                C16240l c16240lLicense = AbstractC11397l.license(abstractC12074l, interfaceC9354l);
                                C18731l c18731l = new C18731l((Object) c10954l2, (InterfaceC14029l) (b3 == true ? 1 : 0), 10);
                                this.f27437l = abstractC12074l;
                                this.f27439l = obj2;
                                this.f27436l = c10954l2;
                                this.f27440l = 3;
                                Object objYandex3 = new C14970l(8, new C5888l(c16240lLicense, b2 == true ? 1 : 0, i9)).yandex(new C13483l(i4, c18731l), this);
                                if (objYandex3 != enumC9342l) {
                                    objYandex3 = Unit.INSTANCE;
                                }
                                if (objYandex3 == enumC9342l) {
                                    return enumC9342l;
                                }
                                c10954l = c10954l2;
                                objLicense = c10954l.build();
                            } else {
                                objLicense = null;
                            }
                        } catch (C2120l e) {
                            throw new C12789l("Illegal Content-Type header format: " + interfaceC9955l.billing().yandex().signatures("Content-Type"), e);
                        }
                    } else {
                        this.f27437l = abstractC12074l;
                        this.f27439l = obj2;
                        this.f27440l = 4;
                        InterfaceC9354l interfaceC9354l2 = z ? (InterfaceC9354l) obj2 : null;
                        if (interfaceC9354l2 == null) {
                            objLicense = null;
                        } else {
                            InterfaceC1388l interfaceC1388l2 = AbstractC11626l.yandex((InterfaceC9955l) obj3).yandex;
                            if (AbstractC8576l.yandex(interfaceC1388l2, c2336l4.loadAd(InputStream.class))) {
                                objLicense = new C11270l(i4, interfaceC9354l2);
                            } else if (AbstractC8576l.yandex(interfaceC1388l2, c2336l4.loadAd(C16240l.class))) {
                                objLicense = AbstractC11397l.license(abstractC12074l, interfaceC9354l2);
                            } else {
                                objLicense = null;
                            }
                        }
                        if (objLicense == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    if (objLicense != null) {
                        InterfaceC6272l interfaceC6272l4 = AbstractC12761l.yandex;
                        StringBuilder sb4 = new StringBuilder("Transformed ");
                        Class<?> cls4 = obj2.getClass();
                        C2336l c2336l5 = AbstractC18202l.yandex;
                        sb4.append(c2336l5.loadAd(cls4));
                        sb4.append(" to ");
                        sb4.append(c2336l5.loadAd(objLicense.getClass()));
                        sb4.append(" for ");
                        sb4.append(AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                        interfaceC6272l4.vip(sb4.toString());
                        this.f27437l = null;
                        this.f27439l = null;
                        this.f27436l = null;
                        this.f27440l = 5;
                        if (abstractC12074l.purchase(this, objLicense) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        AbstractC12761l.yandex.vip("No Default Transformations found for " + AbstractC18202l.yandex.loadAd(obj2.getClass()) + " and expected type " + AbstractC11626l.yandex((InterfaceC9955l) abstractC12074l.f24000l) + " for call " + AbstractC7000l.amazon(((InterfaceC9955l) abstractC12074l.f24000l).billing()));
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC12074l abstractC12074l2 = (AbstractC12074l) this.f27437l;
                AbstractC10022l abstractC10022l = (AbstractC10022l) this.f27439l;
                int i10 = this.f27440l;
                try {
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                C17535l c17535l = (C17535l) this.f27436l;
                                AbstractC2829l.crashlytics(obj);
                                attributes = c17535l;
                                objAmazon = obj;
                            } else {
                                if (i10 != 2) {
                                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                AbstractC2829l.crashlytics(obj);
                            }
                            return Unit.INSTANCE;
                        }
                        AbstractC2829l.crashlytics(obj);
                        C14249l c14249lLoadAd = abstractC10022l.loadAd();
                        attributes = c14249lLoadAd.getAttributes();
                        if (attributes.loadAd(AbstractC17371l.yandex)) {
                            InterfaceC6272l interfaceC6272lYandex = AbstractC17371l.yandex();
                            if (interfaceC6272lYandex.admob()) {
                                StringBuilder sb5 = new StringBuilder("Skipping body saving for ");
                                InterfaceC1814l interfaceC1814l = c14249lLoadAd.f27846l;
                                sb5.append((interfaceC1814l != null ? interfaceC1814l : null).getUrl());
                                interfaceC6272lYandex.vip(sb5.toString());
                            }
                            return Unit.INSTANCE;
                        }
                        InterfaceC6272l interfaceC6272lYandex2 = AbstractC17371l.yandex();
                        if (interfaceC6272lYandex2.admob()) {
                            StringBuilder sb6 = new StringBuilder("Saving body for ");
                            InterfaceC1814l interfaceC1814l2 = c14249lLoadAd.f27846l;
                            if (interfaceC1814l2 == null) {
                                interfaceC1814l2 = null;
                            }
                            sb6.append(interfaceC1814l2.getUrl());
                            interfaceC6272lYandex2.vip(sb6.toString());
                        }
                        this.f27437l = abstractC12074l2;
                        this.f27439l = abstractC10022l;
                        this.f27436l = attributes;
                        this.f27440l = 1;
                        objAmazon = AbstractC13841l.amazon(c14249lLoadAd, this);
                        if (objAmazon == enumC9342l) {
                            return enumC9342l;
                        }
                        AbstractC5170l.loadAd(abstractC10022l.crashlytics());
                        c18435l2 = Unit.INSTANCE;
                        break;
                    } catch (Throwable th) {
                        c18435l2 = new C18435l(th);
                    }
                    AbstractC10022l abstractC10022l2 = ((C14249l) objAmazon).f27845l;
                    AbstractC10022l abstractC10022l3 = abstractC10022l2 != null ? abstractC10022l2 : null;
                    Throwable thYandex = C1171l.yandex(c18435l2);
                    if (thYandex != null) {
                        AbstractC17371l.yandex().isPro("Failed to cancel response body", thYandex);
                    }
                    attributes.mopub(AbstractC17371l.loadAd, Unit.INSTANCE);
                    this.f27437l = null;
                    this.f27439l = null;
                    this.f27436l = null;
                    this.f27440l = 2;
                    if (abstractC12074l2.purchase(this, abstractC10022l3) == enumC9342l) {
                        return enumC9342l;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    try {
                        AbstractC5170l.loadAd(abstractC10022l.crashlytics());
                        c18435l = Unit.INSTANCE;
                        break;
                    } catch (Throwable th3) {
                        c18435l = new C18435l(th3);
                    }
                    Throwable thYandex2 = C1171l.yandex(c18435l);
                    if (thYandex2 == null) {
                        throw th2;
                    }
                    AbstractC17371l.yandex().isPro("Failed to cancel response body", thYandex2);
                    throw th2;
                }
            case 4:
                AbstractC12074l abstractC12074l3 = (AbstractC12074l) this.f27436l;
                Object obj4 = this.f27437l;
                int i11 = this.f27440l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        objLoadAd = obj;
                    } else {
                        if (i11 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                if (!(obj4 instanceof C14249l)) {
                    StringBuilder sb7 = new StringBuilder("Error: HttpClientCall expected, but found ");
                    sb7.append(obj4);
                    InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(obj4.getClass());
                    sb7.append('(');
                    sb7.append(interfaceC1388lLoadAd);
                    sb7.append(").");
                    throw new IllegalStateException(sb7.toString().toString());
                }
                C8403l c8403l = ((C16864l) this.f27439l).f32921l;
                Unit unit5 = Unit.INSTANCE;
                AbstractC10022l abstractC10022l4 = ((C14249l) obj4).f27845l;
                if (abstractC10022l4 == null) {
                    abstractC10022l4 = null;
                }
                this.f27436l = abstractC12074l3;
                this.f27437l = obj4;
                this.f27440l = 1;
                objLoadAd = c8403l.loadAd(unit5, abstractC10022l4, this);
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
                ((C14249l) obj4).f27845l = (AbstractC10022l) objLoadAd;
                this.f27436l = null;
                this.f27437l = null;
                this.f27440l = 2;
                if (abstractC12074l3.purchase(this, obj4) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            case 5:
                C3235l c3235l = (C3235l) this.f27436l;
                C6806l c6806l = (C6806l) this.f27437l;
                int i12 = this.f27440l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27436l = c3235l;
                    this.f27437l = c6806l;
                    this.f27440l = 1;
                    objYandex2 = c3235l.f6929l.yandex(c6806l, this);
                    if (objYandex2 != enumC9342l) {
                    }
                    return enumC9342l;
                }
                if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                objYandex2 = obj;
                C14249l c14249l = (C14249l) objYandex2;
                Set set = AbstractC17488l.yandex;
                InterfaceC1814l interfaceC1814l3 = c14249l.f27846l;
                if (interfaceC1814l3 == null) {
                    interfaceC1814l3 = null;
                }
                if (!set.contains(interfaceC1814l3.getMethod())) {
                    return c14249l;
                }
                C16864l c16864l = ((C12825l) this.f27439l).yandex;
                this.f27436l = null;
                this.f27437l = null;
                this.f27440l = 2;
                Object objYandex4 = AbstractC17488l.yandex(c3235l, c6806l, c14249l, c16864l, this);
                if (objYandex4 != enumC9342l) {
                    return objYandex4;
                }
                return enumC9342l;
            case 6:
                int i13 = this.f27440l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f27436l;
                    Throwable th4 = (Throwable) this.f27437l;
                    C18067l c18067lYandex = ((C14567l) this.f27439l).loadAd.yandex(null);
                    C6539l c6539l = new C6539l(c18067lYandex, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th4.getMessage() + ". Emit fallback session " + c18067lYandex.yandex);
                    this.f27436l = null;
                    this.f27440l = 1;
                    if (interfaceC9427l.isPro(c6539l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                C10700l c10700l = (C10700l) this.f27439l;
                int i14 = this.f27440l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC9427l interfaceC9427l2 = (InterfaceC9427l) this.f27436l;
                    InterfaceC9671l interfaceC9671l = (InterfaceC9671l) this.f27437l;
                    Object obj5 = c10700l.f21708l;
                    if (obj5 == null) {
                        b = false;
                    } else {
                        if (interfaceC9671l != null) {
                            LongPointerWrapper longPointerWrapper = ((InterfaceC2851l) ((InterfaceC9671l) obj5)).getF3035l().f3422l;
                            NativePointer nativePointerMo1845l = ((InterfaceC2851l) interfaceC9671l).getF3035l().f3419l.mo1845l();
                            long[] jArr = {0};
                            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                            long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointerMo1845l).getPtr$cinterop_release();
                            int i15 = AbstractC9795l.yandex;
                            realmcJNI.realm_object_resolve_in(ptr$cinterop_release, ptr$cinterop_release2, jArr);
                            long j = jArr[0];
                            if ((j != 0 ? new LongPointerWrapper(j, false, 2, null) : null) != null) {
                                b = false;
                            }
                        }
                        b = true;
                    }
                    if (interfaceC9671l == null) {
                        interfaceC6942lYandex = b == false ? new C14970l(i3, new C3331l(1)) : new C14970l(i3, new C3331l(0));
                    } else {
                        c10700l.f21708l = interfaceC9671l;
                        interfaceC6942lYandex = b == false ? AbstractC15011l.yandex(interfaceC9671l) : new C2347l(new C15127l(i5, b4 == true ? 1 : 0, i2), AbstractC15011l.yandex(interfaceC9671l));
                    }
                    this.f27436l = null;
                    this.f27437l = null;
                    this.f27440l = 1;
                    if (interfaceC9427l2 instanceof C17993l) {
                        throw ((C17993l) interfaceC9427l2).f35183l;
                    }
                    Object objYandex5 = interfaceC6942lYandex.yandex(interfaceC9427l2, this);
                    if (objYandex5 != enumC9342l) {
                        objYandex5 = Unit.INSTANCE;
                    }
                    if (objYandex5 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l4 = (AbstractC12074l) this.f27437l;
                int i16 = this.f27440l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C0522l c0522l = (C0522l) abstractC12074l4.crashlytics();
                    c11310l = c0522l.yandex;
                    Object obj6 = c0522l.loadAd;
                    if (!(obj6 instanceof InterfaceC9354l)) {
                        return Unit.INSTANCE;
                    }
                    Function5 function5 = (Function5) this.f27439l;
                    C11317l c11317l = new C11317l();
                    AbstractC10022l abstractC10022l5 = ((C14249l) abstractC12074l4.f24000l).f27845l;
                    if (abstractC10022l5 == null) {
                        abstractC10022l5 = null;
                    }
                    this.f27437l = abstractC12074l4;
                    this.f27436l = c11310l;
                    this.f27440l = 1;
                    objInvoke = function5.invoke(c11317l, abstractC10022l5, obj6, c11310l, this);
                    if (objInvoke == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            return Unit.INSTANCE;
                        }
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C11310l c11310l2 = (C11310l) this.f27436l;
                    AbstractC2829l.crashlytics(obj);
                    c11310l = c11310l2;
                    objInvoke = obj;
                }
                if (objInvoke == null) {
                    return Unit.INSTANCE;
                }
                if (!(objInvoke instanceof C6130l) && !c11310l.yandex.mo886strictfp(objInvoke)) {
                    C18073l.metrica("transformResponseBody returned ", objInvoke, " but expected value of type ", c11310l);
                    return null;
                }
                C0522l c0522l2 = new C0522l(c11310l, objInvoke);
                this.f27437l = null;
                this.f27436l = null;
                this.f27440l = 2;
                if (abstractC12074l4.purchase(this, c0522l2) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.f27438l) {
            case 0:
                C14082l c14082l = new C14082l((C2375l) this.f27437l, (C10987l) this.f27439l, (InterfaceC14029l) obj3);
                c14082l.f27436l = (C14061l) obj;
                return c14082l.Signature(Unit.INSTANCE);
            case 1:
                C14082l c14082l2 = new C14082l((C18163l) this.f27439l, (InterfaceC14029l) obj3, 1);
                c14082l2.f27436l = (C9591l) obj;
                c14082l2.f27437l = (C7784l) obj2;
                return c14082l2.Signature(Unit.INSTANCE);
            case 2:
                C14082l c14082l3 = new C14082l(i, (InterfaceC14029l) obj3, 2);
                c14082l3.f27437l = (AbstractC12074l) obj;
                c14082l3.f27439l = obj2;
                return c14082l3.Signature(Unit.INSTANCE);
            case 3:
                C14082l c14082l4 = new C14082l(i, (InterfaceC14029l) obj3, i);
                c14082l4.f27437l = (AbstractC12074l) obj;
                c14082l4.f27439l = (AbstractC10022l) obj2;
                return c14082l4.Signature(Unit.INSTANCE);
            case 4:
                C14082l c14082l5 = new C14082l((C16864l) this.f27439l, (InterfaceC14029l) obj3, 4);
                c14082l5.f27436l = (AbstractC12074l) obj;
                c14082l5.f27437l = obj2;
                return c14082l5.Signature(Unit.INSTANCE);
            case 5:
                C14082l c14082l6 = new C14082l((C12825l) this.f27439l, (InterfaceC14029l) obj3, 5);
                c14082l6.f27436l = (C3235l) obj;
                c14082l6.f27437l = (C6806l) obj2;
                return c14082l6.Signature(Unit.INSTANCE);
            case 6:
                C14082l c14082l7 = new C14082l((C14567l) this.f27439l, (InterfaceC14029l) obj3, 6);
                c14082l7.f27436l = (InterfaceC9427l) obj;
                c14082l7.f27437l = (Throwable) obj2;
                return c14082l7.Signature(Unit.INSTANCE);
            case 7:
                C14082l c14082l8 = new C14082l((InterfaceC14029l) obj3, (C10700l) this.f27439l);
                c14082l8.f27436l = (InterfaceC9427l) obj;
                c14082l8.f27437l = obj2;
                return c14082l8.Signature(Unit.INSTANCE);
            default:
                C14082l c14082l9 = new C14082l((Function5) this.f27439l, (InterfaceC14029l) obj3, 8);
                c14082l9.f27437l = (AbstractC12074l) obj;
                return c14082l9.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14082l(InterfaceC14029l interfaceC14029l, C10700l c10700l) {
        super(3, interfaceC14029l);
        this.f27438l = 7;
        this.f27439l = c10700l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14082l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f27438l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14082l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f27438l = i;
        this.f27439l = obj;
    }
}

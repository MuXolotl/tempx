package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13954l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f27250l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f27251l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f27252l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13954l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f27251l = i;
        this.f27250l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objMo221l;
        Object objYandex;
        Object objStartapp;
        Object objStartapp2;
        Object objStartapp3;
        Object objBilling;
        Object objBilling2;
        C9497l c9497l;
        List list;
        C5682l c5682l;
        String str;
        C4324l c4324l;
        int i = this.f27251l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj2 = this.f27250l;
        String str2 = null;
        switch (i) {
            case 0:
                int i2 = this.f27252l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27252l = 1;
                    if (((C7504l) obj2).mo2158switch(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f27252l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27252l = 1;
                    Object objFirebase = ((C16053l) obj2).smaato.firebase(this);
                    if (objFirebase != enumC9342l) {
                        objFirebase = Unit.INSTANCE;
                    }
                    if (objFirebase == enumC9342l) {
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
            case 2:
                int i4 = this.f27252l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27252l = 1;
                    if (((InterfaceC14058l) obj2).yandex() == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i5 = this.f27252l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27252l = 1;
                    Object objInvoke = ((C11991l) obj2).invoke(this);
                    return objInvoke == enumC9342l ? enumC9342l : objInvoke;
                }
                if (i5 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                int i6 = this.f27252l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AbstractC9694l abstractC9694l = (AbstractC9694l) obj2;
                    abstractC9694l.f19772l = true;
                    Cgoto cgotoMo781return = abstractC9694l.mo781return();
                    this.f27252l = 1;
                    objMo221l = cgotoMo781return.mo221l(this);
                    if (objMo221l == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objMo221l = obj;
                }
                return Collections.singletonList(objMo221l);
            case 5:
                C0205l c0205l = (C0205l) obj2;
                int i7 = this.f27252l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8195l c8195lMopub = c0205l.mopub();
                    if (c8195lMopub != null) {
                        C3625l c3625l = (C3625l) c8195lMopub.f17098l;
                        long j = ((C12814l) c8195lMopub.f17097l).yandex;
                        InterfaceC13515l interfaceC13515l = c0205l.f1158l;
                        if (interfaceC13515l != null) {
                            this.f27252l = 1;
                            Object objPurchase = ((C11528l) interfaceC13515l).purchase(c3625l, j, this);
                            if (objPurchase != enumC9342l) {
                                objPurchase = Unit.INSTANCE;
                            }
                            if (objPurchase == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 6:
                C10304l c10304l = (C10304l) obj2;
                int i8 = this.f27252l;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i8 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c10304l.f20994l.Signature.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C12217l c12217l = c10304l.f20994l;
                this.f27252l = 1;
                if (c12217l.advert() == enumC9342l) {
                    return enumC9342l;
                }
                InterfaceC13515l interfaceC13515l2 = c10304l.f20992l;
                if (interfaceC13515l2 != null) {
                    CharSequence charSequence = c10304l.f20994l.yandex.amazon().f12057l;
                    long j2 = c10304l.f20994l.yandex.amazon().f12061l;
                    this.f27252l = 2;
                    Object objPurchase2 = ((C11528l) interfaceC13515l2).purchase(charSequence, j2, this);
                    if (objPurchase2 != enumC9342l) {
                        objPurchase2 = Unit.INSTANCE;
                    }
                    if (objPurchase2 == enumC9342l) {
                        return enumC9342l;
                    }
                }
                c10304l.f20994l.Signature.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 7:
                C16173l c16173l = (C16173l) obj2;
                int i9 = this.f27252l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i9 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c16173l.signatures = true;
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                this.f27252l = 1;
                if (c16173l.subscription(this) == enumC9342l) {
                    return enumC9342l;
                }
                C8195l c8195lYandex = C16173l.yandex(c16173l);
                if (c8195lYandex != null) {
                    String str3 = (String) c8195lYandex.f17098l;
                    long j3 = ((C12814l) c8195lYandex.f17097l).yandex;
                    InterfaceC13515l interfaceC13515l3 = c16173l.subs;
                    if (interfaceC13515l3 != null) {
                        this.f27252l = 2;
                        Object objPurchase3 = ((C11528l) interfaceC13515l3).purchase(str3, j3, this);
                        if (objPurchase3 != enumC9342l) {
                            objPurchase3 = Unit.INSTANCE;
                        }
                        if (objPurchase3 == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                }
                c16173l.signatures = true;
                return Unit.INSTANCE;
            case 8:
                int i10 = this.f27252l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15178l c15178l = (C15178l) obj2;
                    this.f27252l = 1;
                    C2397l c2397l = new C2397l(1, AbstractC17082l.billing(this));
                    c2397l.license();
                    c15178l.crashlytics.crashlytics.setValue(Boolean.TRUE);
                    c15178l.amazon = c2397l;
                    if (c2397l.Signature() == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i10 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 9:
                int i11 = this.f27252l;
                try {
                    if (i11 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        if (AbstractC5088l.firebase("CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                        }
                        C2667l c2667lYandex = ((C6267l) obj2).crashlytics.yandex();
                        this.f27252l = 1;
                        objYandex = c2667lYandex.yandex(this);
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i11 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objYandex = obj;
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) objYandex;
                    try {
                        C9426l c9426lYandex = ((C10069l) autoCloseable).yandex();
                        AbstractC1214l.yandex(autoCloseable, null);
                        return c9426lYandex;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC1214l.yandex(autoCloseable, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException e) {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                    }
                    return C6267l.smaato;
                }
            default:
                C7644l c7644l = (C7644l) obj2;
                int i12 = this.f27252l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f27252l = 1;
                    objStartapp = c7644l.startapp(this);
                    if (objStartapp == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            objStartapp2 = obj;
                            if (((C4645l) objStartapp2).firebase) {
                                this.f27252l = 3;
                                objStartapp3 = c7644l.startapp(this);
                                if (objStartapp3 == enumC9342l) {
                                    return enumC9342l;
                                }
                                if (((C4645l) objStartapp3).crashlytics.f4736l != Long.MAX_VALUE) {
                                    this.f27252l = 4;
                                    C17464l c17464l = new C17464l("auth.getExchangeToken", C11485l.f23093l);
                                    c17464l.amazon("create_common_token", true);
                                    c17464l.yandex("create_tier_tokens", "0");
                                    objBilling2 = c7644l.billing(c17464l, this);
                                    if (objBilling2 == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    c9497l = (C9497l) AbstractC10802l.isPro((AbstractC14237l) objBilling2);
                                    if (c9497l != null) {
                                        list = c9497l.yandex;
                                    } else {
                                        list = null;
                                    }
                                    if (list == null) {
                                        list = C2580l.f5619l;
                                    }
                                    c5682l = (C5682l) AbstractC16901l.m4217extends(list);
                                    if (c5682l != null) {
                                        str2 = c5682l.crashlytics;
                                    }
                                    str = str2;
                                    if (str != null) {
                                        ArrayList arrayList = AbstractC18569l.yandex;
                                        return Boolean.FALSE;
                                    }
                                    C4645l c4645lYandex = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                                    AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex);
                                    c7644l.f15735l = c4645lYandex;
                                    return Boolean.TRUE;
                                }
                            }
                            this.f27252l = 5;
                            C17464l c17464l2 = new C17464l("auth.getExchangeToken", C15718l.f30870l);
                            c17464l2.amazon("create_common_token", true);
                            c17464l2.yandex("create_tier_tokens", "0");
                            c17464l2.purchase = "5.180";
                            objBilling = c7644l.billing(c17464l2, this);
                            if (objBilling == enumC9342l) {
                                return enumC9342l;
                            }
                            c4324l = (C4324l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
                            if (c4324l != null) {
                                str2 = c4324l.yandex;
                            }
                            str = str2;
                            if (str != null) {
                                ArrayList arrayList2 = AbstractC18569l.yandex;
                                return Boolean.FALSE;
                            }
                            C4645l c4645lYandex2 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                            AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex2);
                            c7644l.f15735l = c4645lYandex2;
                            return Boolean.TRUE;
                        }
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                AbstractC2829l.crashlytics(obj);
                                objBilling = obj;
                                c4324l = (C4324l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
                                if (c4324l != null) {
                                    str2 = c4324l.yandex;
                                }
                                str = str2;
                                if (str != null) {
                                    ArrayList arrayList3 = AbstractC18569l.yandex;
                                    return Boolean.FALSE;
                                }
                                C4645l c4645lYandex3 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                                AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex3);
                                c7644l.f15735l = c4645lYandex3;
                                return Boolean.TRUE;
                            }
                            AbstractC2829l.crashlytics(obj);
                            objBilling2 = obj;
                            c9497l = (C9497l) AbstractC10802l.isPro((AbstractC14237l) objBilling2);
                            if (c9497l != null) {
                                list = c9497l.yandex;
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                list = C2580l.f5619l;
                            }
                            c5682l = (C5682l) AbstractC16901l.m4217extends(list);
                            if (c5682l != null) {
                                str2 = c5682l.crashlytics;
                            }
                            str = str2;
                            if (str != null) {
                                ArrayList arrayList4 = AbstractC18569l.yandex;
                                return Boolean.FALSE;
                            }
                            C4645l c4645lYandex4 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                            AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex4);
                            c7644l.f15735l = c4645lYandex4;
                            return Boolean.TRUE;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objStartapp3 = obj;
                        if (((C4645l) objStartapp3).crashlytics.f4736l != Long.MAX_VALUE) {
                            this.f27252l = 4;
                            C17464l c17464l3 = new C17464l("auth.getExchangeToken", C11485l.f23093l);
                            c17464l3.amazon("create_common_token", true);
                            c17464l3.yandex("create_tier_tokens", "0");
                            objBilling2 = c7644l.billing(c17464l3, this);
                            if (objBilling2 == enumC9342l) {
                                return enumC9342l;
                            }
                            c9497l = (C9497l) AbstractC10802l.isPro((AbstractC14237l) objBilling2);
                            if (c9497l != null) {
                                list = c9497l.yandex;
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                list = C2580l.f5619l;
                            }
                            c5682l = (C5682l) AbstractC16901l.m4217extends(list);
                            if (c5682l != null) {
                                str2 = c5682l.crashlytics;
                            }
                            str = str2;
                            if (str != null) {
                                ArrayList arrayList5 = AbstractC18569l.yandex;
                                return Boolean.FALSE;
                            }
                            C4645l c4645lYandex5 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                            AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex5);
                            c7644l.f15735l = c4645lYandex5;
                            return Boolean.TRUE;
                        }
                        this.f27252l = 5;
                        C17464l c17464l4 = new C17464l("auth.getExchangeToken", C15718l.f30870l);
                        c17464l4.amazon("create_common_token", true);
                        c17464l4.yandex("create_tier_tokens", "0");
                        c17464l4.purchase = "5.180";
                        objBilling = c7644l.billing(c17464l4, this);
                        if (objBilling == enumC9342l) {
                            return enumC9342l;
                        }
                        c4324l = (C4324l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
                        if (c4324l != null) {
                            str2 = c4324l.yandex;
                        }
                        str = str2;
                        if (str != null) {
                            ArrayList arrayList6 = AbstractC18569l.yandex;
                            return Boolean.FALSE;
                        }
                        C4645l c4645lYandex6 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                        AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex6);
                        c7644l.f15735l = c4645lYandex6;
                        return Boolean.TRUE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objStartapp = obj;
                }
                if (((C4645l) objStartapp).purchase.length() != 0) {
                    return Boolean.TRUE;
                }
                ArrayList arrayList7 = AbstractC18569l.yandex;
                this.f27252l = 2;
                objStartapp2 = c7644l.startapp(this);
                if (objStartapp2 == enumC9342l) {
                    return enumC9342l;
                }
                if (((C4645l) objStartapp2).firebase) {
                    this.f27252l = 3;
                    objStartapp3 = c7644l.startapp(this);
                    if (objStartapp3 == enumC9342l) {
                        return enumC9342l;
                    }
                    if (((C4645l) objStartapp3).crashlytics.f4736l != Long.MAX_VALUE) {
                        this.f27252l = 4;
                        C17464l c17464l5 = new C17464l("auth.getExchangeToken", C11485l.f23093l);
                        c17464l5.amazon("create_common_token", true);
                        c17464l5.yandex("create_tier_tokens", "0");
                        objBilling2 = c7644l.billing(c17464l5, this);
                        if (objBilling2 == enumC9342l) {
                            return enumC9342l;
                        }
                        c9497l = (C9497l) AbstractC10802l.isPro((AbstractC14237l) objBilling2);
                        if (c9497l != null) {
                            list = c9497l.yandex;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = C2580l.f5619l;
                        }
                        c5682l = (C5682l) AbstractC16901l.m4217extends(list);
                        if (c5682l != null) {
                            str2 = c5682l.crashlytics;
                        }
                        str = str2;
                        if (str != null) {
                            ArrayList arrayList8 = AbstractC18569l.yandex;
                            return Boolean.FALSE;
                        }
                        C4645l c4645lYandex7 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                        AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex7);
                        c7644l.f15735l = c4645lYandex7;
                        return Boolean.TRUE;
                    }
                }
                this.f27252l = 5;
                C17464l c17464l6 = new C17464l("auth.getExchangeToken", C15718l.f30870l);
                c17464l6.amazon("create_common_token", true);
                c17464l6.yandex("create_tier_tokens", "0");
                c17464l6.purchase = "5.180";
                objBilling = c7644l.billing(c17464l6, this);
                if (objBilling == enumC9342l) {
                    return enumC9342l;
                }
                c4324l = (C4324l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
                if (c4324l != null) {
                    str2 = c4324l.yandex;
                }
                str = str2;
                if (str != null) {
                    ArrayList arrayList9 = AbstractC18569l.yandex;
                    return Boolean.FALSE;
                }
                C4645l c4645lYandex8 = C4645l.yandex((C4645l) c7644l.f15735l, 0L, null, null, null, str, null, null, null, null, null, false, 2031);
                AbstractC2238l.isPro((C7026l) c7644l.f15742l, c4645lYandex8);
                c7644l.f15735l = c4645lYandex8;
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f27251l;
        Object obj = this.f27250l;
        switch (i) {
            case 0:
                return new C13954l((C7504l) obj, interfaceC14029l, 0);
            case 1:
                return new C13954l((C16053l) obj, interfaceC14029l, 1);
            case 2:
                return new C13954l((InterfaceC14058l) obj, interfaceC14029l, 2);
            case 3:
                return new C13954l((C11991l) obj, interfaceC14029l, 3);
            case 4:
                return new C13954l((AbstractC9694l) obj, interfaceC14029l, 4);
            case 5:
                return new C13954l((C0205l) obj, interfaceC14029l, 5);
            case 6:
                return new C13954l((C10304l) obj, interfaceC14029l, 6);
            case 7:
                return new C13954l((C16173l) obj, interfaceC14029l, 7);
            case 8:
                return new C13954l((C15178l) obj, interfaceC14029l, 8);
            case 9:
                return new C13954l((C6267l) obj, interfaceC14029l, 9);
            default:
                return new C13954l((C7644l) obj, interfaceC14029l, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f27251l) {
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
            case 8:
                break;
            case 9:
                break;
        }
        return ((C13954l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}

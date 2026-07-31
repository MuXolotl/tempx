package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17354l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f33815l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f33816l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33817l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f33818l;

    public C17354l(InterfaceC9427l interfaceC9427l, InterfaceC12932l interfaceC12932l) {
        this.f33817l = 7;
        this.f33816l = interfaceC12932l;
        this.f33815l = interfaceC12932l.mo247l(0, AbstractC7999l.loadAd);
        this.f33818l = new C15352l(interfaceC9427l, null, 26);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x0235  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) throws Throwable {
        C8165l c8165l;
        C8921l c8921l;
        C6945l c6945l;
        C13341l c13341l;
        C11526l c11526l;
        InterfaceC9427l interfaceC9427l;
        Object obj2 = obj;
        int i = this.f33817l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l2 = null;
        Object obj3 = this.f33818l;
        Object obj4 = this.f33815l;
        Object obj5 = this.f33816l;
        switch (i) {
            case 0:
                C10700l c10700l = (C10700l) obj5;
                if (interfaceC14029l instanceof C8165l) {
                    c8165l = (C8165l) interfaceC14029l;
                    int i2 = c8165l.f17049l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8165l.f17049l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8165l = new C8165l(this, interfaceC14029l);
                    }
                } else {
                    c8165l = new C8165l(this, interfaceC14029l);
                }
                Object obj6 = c8165l.f17050l;
                int i3 = c8165l.f17049l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj6);
                    InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c10700l.f21708l;
                    if (interfaceC7042l != null) {
                        interfaceC7042l.ads(new C12345l());
                        c8165l.f17051l = obj2;
                        c8165l.f17049l = 1;
                        if (interfaceC7042l.mo2158switch(c8165l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = c8165l.f17051l;
                    AbstractC2829l.crashlytics(obj6);
                }
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj4;
                c10700l.f21708l = AbstractC10999l.mopub(interfaceC2262l, null, 4, new C7641l((Function2) obj3, obj2, interfaceC2262l, (InterfaceC14029l) null, 1), 1);
                return Unit.INSTANCE;
            case 1:
                C18656l c18656l = (C18656l) obj4;
                ((C5655l) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((Function2) ((InterfaceC8714l) obj3).getValue()).invoke(c18656l.crashlytics(), c18656l.amazon.getValue())).booleanValue() : false));
                return Unit.INSTANCE;
            case 2:
                C10700l c10700l2 = (C10700l) obj5;
                C16124l c16124l = (C16124l) obj4;
                if (interfaceC14029l instanceof C8921l) {
                    c8921l = (C8921l) interfaceC14029l;
                    int i4 = c8921l.f18388l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8921l.f18388l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8921l = new C8921l(this, interfaceC14029l);
                    }
                } else {
                    c8921l = new C8921l(this, interfaceC14029l);
                }
                Object obj7 = c8921l.f18387l;
                int i5 = c8921l.f18388l;
                if (i5 == 0) {
                    AbstractC2829l.crashlytics(obj7);
                    Object objInvoke = c16124l.f31577l.invoke(obj2);
                    Object obj8 = c10700l2.f21708l;
                    if (obj8 == AbstractC2878l.yandex || !((Boolean) c16124l.f31576l.invoke(obj8, objInvoke)).booleanValue()) {
                        c10700l2.f21708l = objInvoke;
                        c8921l.f18388l = 1;
                        if (((InterfaceC9427l) obj3).isPro(obj2, c8921l) == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj7);
                }
                return Unit.INSTANCE;
            case 3:
                if (interfaceC14029l instanceof C6945l) {
                    c6945l = (C6945l) interfaceC14029l;
                    int i6 = c6945l.f14570l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c6945l.f14570l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c6945l = new C6945l(this, interfaceC14029l);
                    }
                } else {
                    c6945l = new C6945l(this, interfaceC14029l);
                }
                Object obj9 = c6945l.f14571l;
                int i7 = c6945l.f14570l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj9);
                    InterfaceC9427l interfaceC9427l2 = (InterfaceC9427l) obj5;
                    Object objInvoke2 = ((Function1) obj4).invoke(obj2);
                    if (objInvoke2 == null) {
                        objInvoke2 = (AbstractC11904l) obj3;
                    }
                    c6945l.f14570l = 1;
                    if (interfaceC9427l2.isPro(objInvoke2, c6945l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj9);
                }
                return Unit.INSTANCE;
            case 4:
                InterfaceC12553l interfaceC12553l = (InterfaceC12553l) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (interfaceC12553l instanceof C0261l) {
                    arrayList.add(interfaceC12553l);
                } else if (interfaceC12553l instanceof C12134l) {
                    arrayList.remove(((C12134l) interfaceC12553l).yandex);
                } else if (interfaceC12553l instanceof C7008l) {
                    arrayList.add(interfaceC12553l);
                } else if (interfaceC12553l instanceof C17768l) {
                    arrayList.remove(((C17768l) interfaceC12553l).yandex);
                } else if (interfaceC12553l instanceof C12951l) {
                    arrayList.add(interfaceC12553l);
                } else if (interfaceC12553l instanceof C3426l) {
                    arrayList.remove(((C3426l) interfaceC12553l).yandex);
                } else if (interfaceC12553l instanceof C10129l) {
                    arrayList.remove(((C10129l) interfaceC12553l).yandex);
                }
                AbstractC10999l.mopub((InterfaceC2262l) obj4, null, 0, new C18731l((C9154l) obj3, (InterfaceC12553l) AbstractC16901l.m4212class(arrayList), interfaceC14029l2, 26), 3);
                return Unit.INSTANCE;
            case 5:
                InterfaceC9427l interfaceC9427l3 = (InterfaceC9427l) obj4;
                C9122l c9122l = (C9122l) obj5;
                if (interfaceC14029l instanceof C13341l) {
                    c13341l = (C13341l) interfaceC14029l;
                    int i8 = c13341l.f26187l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13341l.f26187l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13341l = new C13341l(this, interfaceC14029l);
                    }
                } else {
                    c13341l = new C13341l(this, interfaceC14029l);
                }
                Object objInvoke3 = c13341l.f26188l;
                int i9 = c13341l.f26187l;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            obj2 = c13341l.f26189l;
                            AbstractC2829l.crashlytics(objInvoke3);
                            if (!((Boolean) objInvoke3).booleanValue()) {
                                c9122l.f18750l = true;
                                c13341l.f26189l = null;
                                c13341l.f26187l = 3;
                                if (interfaceC9427l3.isPro(obj2, c13341l) == enumC9342l) {
                                    return enumC9342l;
                                }
                            }
                        } else if (i9 != 3) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    AbstractC2829l.crashlytics(objInvoke3);
                } else {
                    AbstractC2829l.crashlytics(objInvoke3);
                    if (c9122l.f18750l) {
                        c13341l.f26189l = null;
                        c13341l.f26187l = 1;
                        if (interfaceC9427l3.isPro(obj2, c13341l) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        c13341l.f26189l = obj2;
                        c13341l.f26187l = 2;
                        objInvoke3 = ((Function2) obj3).invoke(obj2, c13341l);
                        if (objInvoke3 == enumC9342l) {
                            return enumC9342l;
                        }
                        if (!((Boolean) objInvoke3).booleanValue()) {
                            c9122l.f18750l = true;
                            c13341l.f26189l = null;
                            c13341l.f26187l = 3;
                            if (interfaceC9427l3.isPro(obj2, c13341l) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                if (interfaceC14029l instanceof C11526l) {
                    c11526l = (C11526l) interfaceC14029l;
                    int i10 = c11526l.f23184l;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c11526l.f23184l = i10 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c11526l = new C11526l(this, interfaceC14029l);
                    }
                } else {
                    c11526l = new C11526l(this, interfaceC14029l);
                }
                Object obj10 = c11526l.f23185l;
                int i11 = c11526l.f23184l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        interfaceC9427l = c11526l.f23186l;
                        AbstractC2829l.crashlytics(obj10);
                    } else {
                        if (i11 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj10);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj10);
                InterfaceC9427l interfaceC9427l4 = (InterfaceC9427l) obj5;
                c11526l.f23186l = interfaceC9427l4;
                c11526l.f23184l = 1;
                Object objBilling = AbstractC2021l.billing((AbstractC15781l) obj4, true, (C8125l) obj3, c11526l);
                if (objBilling == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC9427l = interfaceC9427l4;
                obj10 = objBilling;
                c11526l.f23186l = null;
                c11526l.f23184l = 2;
                if (interfaceC9427l.isPro(obj10, c11526l) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                Object objMopub = AbstractC5712l.mopub((InterfaceC12932l) obj5, obj2, obj4, (C15352l) obj3, interfaceC14029l);
                return objMopub == enumC9342l ? objMopub : Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17354l(Object obj, Object obj2, Object obj3, int i) {
        this.f33817l = i;
        this.f33816l = obj;
        this.f33815l = obj2;
        this.f33818l = obj3;
    }

    public C17354l(C16124l c16124l, C10700l c10700l, InterfaceC9427l interfaceC9427l) {
        this.f33817l = 2;
        this.f33815l = c16124l;
        this.f33816l = c10700l;
        this.f33818l = interfaceC9427l;
    }
}

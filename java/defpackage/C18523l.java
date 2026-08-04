package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18523l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ boolean f36150l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f36151l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36152l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36153l = 0;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f36154l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36155l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(C5616l c5616l, boolean z, InterfaceC1489l interfaceC1489l, Function0 function0, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36151l = c5616l;
        this.f36150l = z;
        this.f36154l = interfaceC1489l;
        this.f36152l = function0;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0255  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x028c  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
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
    public final Object Signature(Object obj) {
        Object objInvoke;
        AbstractC12669l c1046l;
        Object objPurchase;
        Object objLoadAd;
        C16076l c16076l;
        C15553l c15553l;
        C18393l c18393l;
        AudioTrack audioTrack;
        Object objBilling;
        AudioTrack audioTrack2;
        Object objBilling2;
        AudioTrack audioTrack3;
        int i = this.f36153l;
        Object obj2 = this.f36152l;
        Object obj3 = EnumC9342l.f19165l;
        byte b = 0;
        switch (i) {
            case 0:
                C1162l c1162l = (C1162l) obj2;
                boolean z = this.f36150l;
                int i2 = this.f36155l;
                try {
                    if (i2 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C0360l c0360l = (C0360l) this.f36154l;
                        this.f36150l = z;
                        this.f36155l = 1;
                        objPurchase = C0360l.purchase(c0360l, z, c1162l, this);
                        if (objPurchase == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.f36151l;
                            AbstractC2829l.crashlytics(obj);
                            objInvoke = obj;
                            c1046l = new C1046l(((Number) objInvoke).intValue(), th);
                            return new C8195l(c1046l, Boolean.valueOf(z));
                        }
                        AbstractC2829l.crashlytics(obj);
                        objPurchase = obj;
                    }
                    c1046l = (AbstractC12669l) objPurchase;
                    break;
                } catch (Throwable th) {
                    th = th;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.f36151l = th;
                    this.f36150l = z;
                    this.f36155l = 2;
                    objInvoke = c1162l.invoke(boolValueOf, this);
                    if (objInvoke == obj3) {
                        return obj3;
                    }
                }
                return new C8195l(c1046l, Boolean.valueOf(z));
            case 1:
                C7136l c7136l = (C7136l) this.f36151l;
                int i3 = this.f36155l;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            AbstractC2829l.crashlytics(obj);
                        } else {
                            if (i3 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AbstractC2829l.crashlytics(obj);
                            objLoadAd = obj;
                        }
                        c7136l.purchase(false);
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    if (this.f36150l) {
                        C5616l c5616l = c7136l.adcel;
                        Float f = new Float(0.0f);
                        this.f36155l = 1;
                        if (c5616l.billing(this, f) == obj3) {
                            return obj3;
                        }
                    }
                    C5616l c5616l2 = c7136l.adcel;
                    Float f2 = new Float(1.0f);
                    InterfaceC17807l interfaceC17807l = (InterfaceC17807l) this.f36154l;
                    C6501l c6501l = new C6501l((C11925l) obj2, c7136l, 0);
                    this.f36155l = 2;
                    objLoadAd = C5616l.loadAd(c5616l2, f2, interfaceC17807l, null, c6501l, this, 4);
                    if (objLoadAd == obj3) {
                        return obj3;
                    }
                    c7136l.purchase(false);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    c7136l.purchase(false);
                    throw th2;
                }
            case 2:
                boolean z2 = this.f36150l;
                AudioTrack audioTrack4 = (AudioTrack) obj2;
                try {
                    switch (this.f36155l) {
                        case 0:
                            AbstractC2829l.crashlytics(obj);
                            if (!z2) {
                                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                                C9597l c9597l = audioTrack4.f36610volatile;
                                int i4 = c9597l.yandex;
                                long j = c9597l.loadAd;
                                this.f36154l = null;
                                this.f36151l = audioTrack4;
                                this.f36155l = 3;
                                C17464l c17464l = new C17464l("audio.delete", C2782l.f6069l);
                                c17464l.loadAd(i4, "audio_id");
                                c17464l.crashlytics(j, "owner_id");
                                if (c7644lLoadAd.billing(c17464l, this) == obj3) {
                                    return obj3;
                                }
                                audioTrack = audioTrack4;
                                audioTrack.applovin = Boolean.FALSE;
                                Unit unit = Unit.INSTANCE;
                                c16076l = VKXApplication.f36632l;
                                if (c16076l == null) {
                                    c16076l = null;
                                }
                                c16076l.getClass();
                                AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                                if (z2) {
                                    C8490l c8490l = AbstractC6025l.yandex;
                                    c18393l = new C18393l(audioTrack4);
                                    this.f36154l = null;
                                    this.f36151l = null;
                                    this.f36155l = 4;
                                    if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                        return obj3;
                                    }
                                    C8490l c8490l2 = AbstractC6025l.yandex;
                                    this.f36154l = null;
                                    this.f36155l = 5;
                                    if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                        return obj3;
                                    }
                                } else {
                                    C8490l c8490l3 = AbstractC6025l.yandex;
                                    c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                    this.f36154l = null;
                                    this.f36151l = null;
                                    this.f36155l = 6;
                                    if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                        return obj3;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            C9597l c9597l2 = audioTrack4.f36610volatile;
                            if (c9597l2.crashlytics) {
                                C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
                                int i5 = c9597l2.yandex;
                                long j2 = c9597l2.loadAd;
                                this.f36154l = null;
                                this.f36151l = audioTrack4;
                                this.f36155l = 1;
                                C17464l c17464l2 = new C17464l("audio.restore", C13863l.f27113l);
                                c17464l2.loadAd(i5, "audio_id");
                                c17464l2.crashlytics(j2, "owner_id");
                                objBilling2 = c7644lLoadAd2.billing(c17464l2, this);
                                if (objBilling2 == obj3) {
                                    return obj3;
                                }
                                audioTrack3 = audioTrack4;
                                audioTrack3.applovin = Boolean.TRUE;
                                Unit unit2 = Unit.INSTANCE;
                                c16076l = VKXApplication.f36632l;
                                if (c16076l == null) {
                                    c16076l = null;
                                }
                                c16076l.getClass();
                                AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                                if (z2) {
                                    C8490l c8490l4 = AbstractC6025l.yandex;
                                    c18393l = new C18393l(audioTrack4);
                                    this.f36154l = null;
                                    this.f36151l = null;
                                    this.f36155l = 4;
                                    if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                        return obj3;
                                    }
                                    C8490l c8490l5 = AbstractC6025l.yandex;
                                    this.f36154l = null;
                                    this.f36155l = 5;
                                    if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                        return obj3;
                                    }
                                } else {
                                    C8490l c8490l6 = AbstractC6025l.yandex;
                                    c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                    this.f36154l = null;
                                    this.f36151l = null;
                                    this.f36155l = 6;
                                    if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                        return obj3;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            C7644l c7644lLoadAd3 = AbstractC16584l.loadAd();
                            int i6 = c9597l2.yandex;
                            long j3 = c9597l2.loadAd;
                            String str = audioTrack4.billing;
                            this.f36154l = null;
                            this.f36151l = audioTrack4;
                            this.f36155l = 2;
                            C17464l c17464l3 = new C17464l("audio.add", C14823l.f29014l);
                            c17464l3.loadAd(i6, "audio_id");
                            c17464l3.crashlytics(j3, "owner_id");
                            c17464l3.yandex("access_key", str);
                            objBilling = c7644lLoadAd3.billing(c17464l3, this);
                            if (objBilling == obj3) {
                                return obj3;
                            }
                            audioTrack2 = audioTrack4;
                            audioTrack3 = audioTrack2;
                            audioTrack3.applovin = Boolean.TRUE;
                            Unit unit3 = Unit.INSTANCE;
                            c16076l = VKXApplication.f36632l;
                            if (c16076l == null) {
                                c16076l = null;
                            }
                            c16076l.getClass();
                            AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                            if (z2) {
                                C8490l c8490l7 = AbstractC6025l.yandex;
                                c18393l = new C18393l(audioTrack4);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 4;
                                if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                    return obj3;
                                }
                                C8490l c8490l8 = AbstractC6025l.yandex;
                                this.f36154l = null;
                                this.f36155l = 5;
                                if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                    return obj3;
                                }
                            } else {
                                C8490l c8490l9 = AbstractC6025l.yandex;
                                c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 6;
                                if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                    return obj3;
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            AudioTrack audioTrack5 = (AudioTrack) this.f36151l;
                            AbstractC2829l.crashlytics(obj);
                            audioTrack3 = audioTrack5;
                            objBilling2 = obj;
                            audioTrack3.applovin = Boolean.TRUE;
                            Unit unit4 = Unit.INSTANCE;
                            c16076l = VKXApplication.f36632l;
                            if (c16076l == null) {
                                c16076l = null;
                            }
                            c16076l.getClass();
                            AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                            if (z2) {
                                C8490l c8490l10 = AbstractC6025l.yandex;
                                c18393l = new C18393l(audioTrack4);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 4;
                                if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                    return obj3;
                                }
                                C8490l c8490l11 = AbstractC6025l.yandex;
                                this.f36154l = null;
                                this.f36155l = 5;
                                if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                    return obj3;
                                }
                            } else {
                                C8490l c8490l12 = AbstractC6025l.yandex;
                                c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 6;
                                if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                    return obj3;
                                }
                            }
                            return Unit.INSTANCE;
                        case 2:
                            AudioTrack audioTrack6 = (AudioTrack) this.f36151l;
                            AbstractC2829l.crashlytics(obj);
                            audioTrack2 = audioTrack6;
                            objBilling = obj;
                            audioTrack3 = audioTrack2;
                            audioTrack3.applovin = Boolean.TRUE;
                            Unit unit5 = Unit.INSTANCE;
                            c16076l = VKXApplication.f36632l;
                            if (c16076l == null) {
                                c16076l = null;
                            }
                            c16076l.getClass();
                            AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                            if (z2) {
                                C8490l c8490l13 = AbstractC6025l.yandex;
                                c18393l = new C18393l(audioTrack4);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 4;
                                if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                    return obj3;
                                }
                                C8490l c8490l14 = AbstractC6025l.yandex;
                                this.f36154l = null;
                                this.f36155l = 5;
                                if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                    return obj3;
                                }
                            } else {
                                C8490l c8490l15 = AbstractC6025l.yandex;
                                c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 6;
                                if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                    return obj3;
                                }
                            }
                            return Unit.INSTANCE;
                        case 3:
                            audioTrack = (AudioTrack) this.f36151l;
                            AbstractC2829l.crashlytics(obj);
                            audioTrack.applovin = Boolean.FALSE;
                            Unit unit6 = Unit.INSTANCE;
                            c16076l = VKXApplication.f36632l;
                            if (c16076l == null) {
                                c16076l = null;
                            }
                            c16076l.getClass();
                            AbstractC10999l.mopub(c16076l, null, 0, new C18160l(2, b == true ? 1 : 0, 15), 3);
                            if (z2) {
                                C8490l c8490l16 = AbstractC6025l.yandex;
                                c18393l = new C18393l(audioTrack4);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 4;
                                if (AbstractC6025l.yandex(c18393l, this) == obj3) {
                                    return obj3;
                                }
                                C8490l c8490l17 = AbstractC6025l.yandex;
                                this.f36154l = null;
                                this.f36155l = 5;
                                if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                    return obj3;
                                }
                            } else {
                                C8490l c8490l18 = AbstractC6025l.yandex;
                                c15553l = new C15553l(audioTrack4.loadAd, audioTrack4.crashlytics);
                                this.f36154l = null;
                                this.f36151l = null;
                                this.f36155l = 6;
                                if (AbstractC6025l.yandex(c15553l, this) == obj3) {
                                    return obj3;
                                }
                            }
                            return Unit.INSTANCE;
                        case 4:
                            AbstractC2829l.crashlytics(obj);
                            C8490l c8490l19 = AbstractC6025l.yandex;
                            this.f36154l = null;
                            this.f36155l = 5;
                            if (AbstractC6025l.yandex(C3689l.yandex, this) == obj3) {
                                return obj3;
                            }
                            return Unit.INSTANCE;
                        case 5:
                        case 6:
                            AbstractC2829l.crashlytics(obj);
                            return Unit.INSTANCE;
                        default:
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable unused) {
                }
                break;
            case 3:
                boolean z3 = this.f36150l;
                C16076l c16076l2 = (C16076l) this.f36154l;
                List list = (List) obj2;
                C16811l c16811l = (C16811l) this.f36151l;
                int i7 = this.f36155l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!c16076l2.mopub()) {
                        C10507l c10507l = C10507l.crashlytics;
                        ArrayList arrayListMopub = AbstractC1383l.mopub(list);
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListMopub, 10));
                        Iterator it = arrayListMopub.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC2133l.yandex((C10507l) it.next()));
                        }
                        C2258l c2258l = c16076l2.f31521l;
                        if (c2258l.amazon instanceof InterfaceC2244l) {
                            c2258l.loadAd(arrayListMopub);
                        } else {
                            C2427l c2427lMo2778l = c16811l.mo2778l();
                            c2258l.yandex(c2427lMo2778l != null ? c2427lMo2778l.yandex : null, arrayListMopub, z3);
                        }
                        if (z3) {
                            c16811l.mo2768l(arrayList);
                        } else {
                            c16811l.mo2754default(c16811l.mo2761implements() + 1, arrayList);
                        }
                        return Unit.INSTANCE;
                    }
                    C16076l c16076l3 = (C16076l) this.f36154l;
                    int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
                    if (iFirebase < 16) {
                        iFirebase = 16;
                    }
                    Map linkedHashMap = new LinkedHashMap(iFirebase);
                    for (Object obj4 : list) {
                        linkedHashMap.put(((AbstractC18643l) obj4).getYandex(), obj4);
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AbstractC18643l) it2.next()).getYandex());
                    }
                    InterfaceC17817l c13099l = new C13099l(list);
                    this.f36151l = null;
                    this.f36155l = 1;
                    if (c16076l3.firebase(linkedHashMap, arrayList2, c13099l, C13305l.mopub, this) == obj3) {
                        return obj3;
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
                int i8 = this.f36155l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l3 = (C5616l) this.f36151l;
                    Float f3 = new Float(this.f36150l ? 1.0f : 0.0f);
                    InterfaceC1489l interfaceC1489l = (InterfaceC1489l) this.f36154l;
                    this.f36155l = 1;
                    if (C5616l.loadAd(c5616l3, f3, interfaceC1489l, null, null, this, 12) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            default:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36154l;
                int i9 = this.f36155l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C12951l c12951l = (C12951l) interfaceC8714l.getValue();
                    if (c12951l != null) {
                        C2403l c2403l = (C2403l) obj2;
                        InterfaceC12553l c3426l = this.f36150l ? new C3426l(c12951l) : new C10129l(c12951l);
                        if (c2403l != null) {
                            this.f36151l = interfaceC8714l;
                            this.f36155l = 1;
                            if (c2403l.yandex(c3426l, this) == obj3) {
                                return obj3;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i9 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC8714l = (InterfaceC8714l) this.f36151l;
                AbstractC2829l.crashlytics(obj);
                interfaceC8714l.setValue(null);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f36153l;
        Object obj2 = this.f36152l;
        switch (i) {
            case 0:
                C18523l c18523l = new C18523l((C0360l) this.f36154l, (C1162l) obj2, interfaceC14029l);
                c18523l.f36150l = ((Boolean) obj).booleanValue();
                return c18523l;
            case 1:
                return new C18523l(this.f36150l, (C7136l) this.f36151l, (InterfaceC17807l) this.f36154l, (C11925l) obj2, interfaceC14029l);
            case 2:
                C18523l c18523l2 = new C18523l(this.f36150l, (AudioTrack) obj2, interfaceC14029l);
                c18523l2.f36154l = obj;
                return c18523l2;
            case 3:
                C18523l c18523l3 = new C18523l((C16076l) this.f36154l, (List) obj2, this.f36150l, interfaceC14029l);
                c18523l3.f36151l = obj;
                return c18523l3;
            case 4:
                return new C18523l((C5616l) this.f36151l, this.f36150l, (InterfaceC1489l) this.f36154l, (Function0) obj2, interfaceC14029l);
            default:
                return new C18523l((InterfaceC8714l) this.f36154l, this.f36150l, (C2403l) obj2, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36153l) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C18523l) ads((InterfaceC14029l) obj2, bool)).Signature(Unit.INSTANCE);
            case 1:
                return ((C18523l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C18523l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C18523l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C18523l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C18523l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(C0360l c0360l, C1162l c1162l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36154l = c0360l;
        this.f36152l = c1162l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(InterfaceC8714l interfaceC8714l, boolean z, C2403l c2403l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36154l = interfaceC8714l;
        this.f36150l = z;
        this.f36152l = c2403l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(C16076l c16076l, List list, boolean z, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36154l = c16076l;
        this.f36152l = list;
        this.f36150l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(boolean z, C7136l c7136l, InterfaceC17807l interfaceC17807l, C11925l c11925l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36150l = z;
        this.f36151l = c7136l;
        this.f36154l = interfaceC17807l;
        this.f36152l = c11925l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18523l(boolean z, AudioTrack audioTrack, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36150l = z;
        this.f36152l = audioTrack;
    }
}

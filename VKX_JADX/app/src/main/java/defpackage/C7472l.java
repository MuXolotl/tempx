package defpackage;

import android.os.Bundle;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚۘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7472l implements InterfaceC15514l, InterfaceC17866l, InterfaceC15244l, InterfaceC10599l, InterfaceC6688l, InterfaceC5152l, InterfaceC14713l, InterfaceC6642l, InterfaceC13540l, InterfaceC9746l, InterfaceC3501l, InterfaceC17030l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15470l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C7472l f15456l = new C7472l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C7472l f15449l = new C7472l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C7472l f15462l = new C7472l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C7472l f15461l = new C7472l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C7472l f15465l = new C7472l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C7472l f15450l = new C7472l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C7472l f15453l = new C7472l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C7472l f15464l = new C7472l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C7472l f15459l = new C7472l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C7472l f15466l = new C7472l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C7472l f15463l = new C7472l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C7472l f15448l = new C7472l(12);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C7472l f15467l = new C7472l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C7472l f15460l = new C7472l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C7472l f15454l = new C7472l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C7472l f15458l = new C7472l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C7472l f15468l = new C7472l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C7472l f15457l = new C7472l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C7472l f15452l = new C7472l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C7472l f15451l = new C7472l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C7472l f15447l = new C7472l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C7472l f15469l = new C7472l(22);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final /* synthetic */ C7472l f15455l = new C7472l(23);

    public /* synthetic */ C7472l(int i) {
        this.f15470l = i;
    }

    public static final int crashlytics(String str) {
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        return lowerCase;
    }

    public static InterfaceC5706l isPro(InterfaceC11661l interfaceC11661l) {
        while (interfaceC11661l instanceof InterfaceC0207l) {
            InterfaceC0207l interfaceC0207l = (InterfaceC0207l) interfaceC11661l;
            if (interfaceC0207l.mo367while() != 2) {
                break;
            }
            interfaceC11661l = (InterfaceC0207l) AbstractC16901l.m4224instanceof(interfaceC0207l.license());
            if (interfaceC11661l == null) {
                return null;
            }
        }
        return interfaceC11661l.billing();
    }

    public boolean admob(InterfaceC16902l interfaceC16902l, InterfaceC16902l interfaceC16902l2, boolean z, Function2 function2) {
        if (interfaceC16902l.equals(interfaceC16902l2)) {
            return true;
        }
        if (AbstractC8576l.yandex(interfaceC16902l.Signature(), interfaceC16902l2.Signature())) {
            return false;
        }
        InterfaceC8371l interfaceC8371lSignature = interfaceC16902l.Signature();
        InterfaceC8371l interfaceC8371lSignature2 = interfaceC16902l2.Signature();
        return (((interfaceC8371lSignature instanceof InterfaceC0207l) || (interfaceC8371lSignature2 instanceof InterfaceC0207l)) ? ((Boolean) function2.invoke(interfaceC8371lSignature, interfaceC8371lSignature2)).booleanValue() : purchase(interfaceC8371lSignature, interfaceC8371lSignature2, z)) && interfaceC16902l.getIndex() == interfaceC16902l2.getIndex();
    }

    @Override // defpackage.InterfaceC10599l
    public AbstractC18041l ads(C18128l c18128l, String str, AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2) {
        if (str.equals("kotlin.jvm.PlatformType")) {
            return c18128l.smaato(AbstractC8450l.billing) ? new C6530l(abstractC15211l, abstractC15211l2, 0) : AbstractC3605l.subs(abstractC15211l, abstractC15211l2);
        }
        return C8741l.loadAd(EnumC5123l.f11124l, str, abstractC15211l.toString(), abstractC15211l2.toString());
    }

    @Override // defpackage.InterfaceC3501l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC17030l
    public long billing(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = AbstractC7789l.yandex;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        c16864l.f32921l.firebase(C8403l.f17386l, new C18182l((Function2) abstractC5563l, null, 1));
    }

    @Override // defpackage.InterfaceC6642l
    public boolean firebase(Object obj, Object obj2) {
        return AbstractC8576l.yandex(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC15514l
    public Object loadAd(C14187l c14187l, ClassLoader classLoader, ArrayList arrayList, InterfaceC14029l interfaceC14029l) throws Throwable {
        C12009l c12009l;
        Iterator it;
        C14187l c14187l2;
        if (interfaceC14029l instanceof C12009l) {
            c12009l = (C12009l) interfaceC14029l;
            int i = c12009l.f23933l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12009l.f23933l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12009l = new C12009l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c12009l = new C12009l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c12009l.f23929l;
        int i2 = c12009l.f23933l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c14187l.f27779l.vip(AbstractC2749l.loadAd, c14187l);
            it = arrayList.iterator();
            c14187l2 = c14187l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = c12009l.f23934l;
            classLoader = c12009l.f23931l;
            C14187l c14187l3 = c12009l.f23932l;
            AbstractC2829l.crashlytics(obj);
            c14187l2 = c14187l3;
        }
        while (it.hasNext()) {
            Function3 function3 = ((C10897l) it.next()).yandex;
            c12009l.f23932l = c14187l2;
            c12009l.f23931l = classLoader;
            c12009l.f23934l = it;
            c12009l.f23933l = 1;
            Object objInvoke = function3.invoke(c14187l2, classLoader, c12009l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14713l
    public long mopub(C3737l c3737l, int i) {
        return c3737l.billing.smaato(i);
    }

    public boolean purchase(InterfaceC8371l interfaceC8371l, InterfaceC8371l interfaceC8371l2, boolean z) {
        if ((interfaceC8371l instanceof InterfaceC17477l) && (interfaceC8371l2 instanceof InterfaceC17477l)) {
            return AbstractC8576l.yandex(((InterfaceC17477l) interfaceC8371l).metrica(), ((InterfaceC17477l) interfaceC8371l2).metrica());
        }
        if ((interfaceC8371l instanceof InterfaceC16902l) && (interfaceC8371l2 instanceof InterfaceC16902l)) {
            return admob((InterfaceC16902l) interfaceC8371l, (InterfaceC16902l) interfaceC8371l2, z, C15460l.f30247l);
        }
        if (!(interfaceC8371l instanceof InterfaceC11661l) || !(interfaceC8371l2 instanceof InterfaceC11661l)) {
            return ((interfaceC8371l instanceof InterfaceC9921l) && (interfaceC8371l2 instanceof InterfaceC9921l)) ? AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) interfaceC8371l)).f7826l, ((AbstractC3740l) ((InterfaceC9921l) interfaceC8371l2)).f7826l) : AbstractC8576l.yandex(interfaceC8371l, interfaceC8371l2);
        }
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) interfaceC8371l;
        InterfaceC11661l interfaceC11661l2 = (InterfaceC11661l) interfaceC8371l2;
        if (!interfaceC11661l.equals(interfaceC11661l2)) {
            if (AbstractC8576l.yandex(interfaceC11661l.getName(), interfaceC11661l2.getName()) && ((!(interfaceC11661l instanceof InterfaceC5436l) || !(interfaceC11661l2 instanceof InterfaceC5436l) || ((InterfaceC5436l) interfaceC11661l).mo750case() == ((InterfaceC5436l) interfaceC11661l2).mo750case()) && ((!AbstractC8576l.yandex(interfaceC11661l.Signature(), interfaceC11661l2.Signature()) || (z && AbstractC8576l.yandex(isPro(interfaceC11661l), isPro(interfaceC11661l2)))) && !AbstractC11125l.remoteconfig(interfaceC11661l) && !AbstractC11125l.remoteconfig(interfaceC11661l2)))) {
                InterfaceC8371l interfaceC8371lSignature = interfaceC11661l.Signature();
                InterfaceC8371l interfaceC8371lSignature2 = interfaceC11661l2.Signature();
                if (((interfaceC8371lSignature instanceof InterfaceC0207l) || (interfaceC8371lSignature2 instanceof InterfaceC0207l)) ? false : purchase(interfaceC8371lSignature, interfaceC8371lSignature2, z)) {
                    C14450l c14450l = new C14450l(new C8634l(z, interfaceC11661l, interfaceC11661l2, 6));
                    if (c14450l.remoteconfig(interfaceC11661l, interfaceC11661l2, null, true).loadAd() != 1 || c14450l.remoteconfig(interfaceC11661l2, interfaceC11661l, null, true).loadAd() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return AbstractC5103l.billing((Executor) c11644l.mo622l(new C12638l(InterfaceC2293l.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC3501l
    public void startapp(InterfaceC13490l interfaceC13490l, int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length = iArr.length;
        int i5 = i - i3;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = i5;
            i5 += i7;
            i2++;
            i6++;
        }
    }

    public C9804l subs(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C9804l(httpURLConnection);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C7905l c7905l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C1498l c1498l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C3671l c3671l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C9606l c9606l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f15470l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C7905l) {
                    c7905l = (C7905l) abstractC0283l;
                    int i2 = c7905l.f16485l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c7905l.f16485l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c7905l = new C7905l(this, abstractC0283l);
                    }
                } else {
                    c7905l = new C7905l(this, abstractC0283l);
                }
                Object objYandex = c7905l.f16486l;
                int i3 = c7905l.f16485l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C4363l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c7905l.f16485l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c7905l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C1498l) {
                    c1498l = (C1498l) abstractC0283l;
                    int i4 = c1498l.f3746l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c1498l.f3746l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c1498l = new C1498l(this, abstractC0283l);
                    }
                } else {
                    c1498l = new C1498l(this, abstractC0283l);
                }
                Object objYandex2 = c1498l.f3747l;
                int i5 = c1498l.f3746l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C18552l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c1498l.f3746l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c1498l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C3671l) {
                    c3671l = (C3671l) abstractC0283l;
                    int i6 = c3671l.f7730l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3671l.f7730l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3671l = new C3671l(this, abstractC0283l);
                    }
                } else {
                    c3671l = new C3671l(this, abstractC0283l);
                }
                Object objYandex3 = c3671l.f7731l;
                int i7 = c3671l.f7730l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7906l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c3671l.f7730l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c3671l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C9606l) {
                    c9606l = (C9606l) abstractC0283l;
                    int i8 = c9606l.f19572l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c9606l.f19572l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c9606l = new C9606l(this, abstractC0283l);
                    }
                } else {
                    c9606l = new C9606l(this, abstractC0283l);
                }
                Object objYandex4 = c9606l.f19573l;
                int i9 = c9606l.f19572l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C6483l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c9606l.f19572l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c9606l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f15470l) {
            case 11:
                return "StructuralEqualityPolicy";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#Bottom";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = C14302l.admob;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC4311l.mopub(bundle) : AbstractC4311l.mopub(null);
    }

    @Override // defpackage.InterfaceC6688l
    public int yandex() {
        return 2;
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import org.conscrypt.Conscrypt;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;

/* JADX INFO: renamed from: lٜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C18450l implements InterfaceC11210l, InterfaceC15244l, InterfaceC12702l, InterfaceC17325l, InterfaceC6642l, InterfaceC18565l, InterfaceC13540l, InterfaceC8982l, InterfaceC16011l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36050l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C14855l f36026l = new C14855l(-1.0f, -1.0f);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14855l f36017l = new C14855l(0.0f, -1.0f);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C14855l f36036l = new C14855l(1.0f, -1.0f);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C14855l f36035l = new C14855l(-1.0f, 0.0f);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14855l f36043l = new C14855l(0.0f, 0.0f);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C14855l f36018l = new C14855l(1.0f, 0.0f);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C14855l f36021l = new C14855l(-1.0f, 1.0f);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C14855l f36042l = new C14855l(0.0f, 1.0f);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C14855l f36032l = new C14855l(1.0f, 1.0f);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C0086l f36044l = new C0086l(-1.0f);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C0086l f36040l = new C0086l(0.0f);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C0086l f36016l = new C0086l(1.0f);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C15089l f36046l = new C15089l(-1.0f);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C15089l f36034l = new C15089l(0.0f);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15089l f36023l = new C15089l(1.0f);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C18450l f36028l = new C18450l(2);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C18450l f36048l = new C18450l(3);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C18450l f36027l = new C18450l(4);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C18450l f36020l = new C18450l(5);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C18450l f36019l = new C18450l(6);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C18450l f36015l = new C18450l(7);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C10828l f36049l = new C10828l("PackageViewDescriptorFactory", 4);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C18450l f36025l = new C18450l(9);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C18450l f36031l = new C18450l(10);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C18450l f36038l = new C18450l(11);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C18450l f36014l = new C18450l(12);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final C18450l f36030l = new C18450l(13);

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final C18450l f36037l = new C18450l(14);

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C18450l f36047l = new C18450l(15);

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C18450l f36029l = new C18450l(16);

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static final C18450l f36041l = new C18450l(17);

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final C18450l f36013l = new C18450l(18);

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final C18450l f36045l = new C18450l(19);

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final C18450l f36024l = new C18450l(20);

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final C18450l f36033l = new C18450l(21);

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final C18450l f36039l = new C18450l(22);

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public static final C18450l f36022l = new C18450l(23);

    public /* synthetic */ C18450l(int i) {
        this.f36050l = i;
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        int i = C4763l.startapp;
        return new C14297l(2, AbstractC17587l.startapp(new C17798l(1, ((InterfaceC17477l) obj).metrica().yandex()), C1490l.f3730l));
    }

    @Override // defpackage.InterfaceC8982l
    public boolean amazon(SSLSocket sSLSocket) {
        return C18314l.loadAd && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.InterfaceC11210l
    public Object billing(C11039l c11039l) {
        C13863l c13863l = C13863l.f27121l;
        C16287l.yandex.getClass();
        Object objAmazon = c13863l.amazon(C16287l.crashlytics(), c11039l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC11210l
    public String crashlytics(Context context) {
        return context.getString(R.string.cache_library_title_virtual);
    }

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        return Integer.valueOf(Math.round(AbstractC14878l.amazon(abstractC9542l) * f));
    }

    @Override // defpackage.InterfaceC6642l
    public boolean firebase(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.InterfaceC8982l
    public InterfaceC2332l isPro(SSLSocket sSLSocket) {
        return new C18314l();
    }

    @Override // defpackage.InterfaceC11210l
    public /* bridge */ /* synthetic */ C8195l loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC18565l
    public float mopub(float f) {
        double d = f;
        return (float) (d < 0.031248d ? d / 16.0d : AbstractC16358l.billing(d, 1.8d));
    }

    public void purchase(InterfaceC3905l interfaceC3905l) {
        interfaceC3905l.subs(C1032l.class, C17659l.yandex);
        interfaceC3905l.subs(C2681l.class, C8500l.yandex);
        interfaceC3905l.subs(AbstractC7837l.class, C18652l.yandex);
        interfaceC3905l.subs(AbstractC15011l.class, C17882l.yandex);
        interfaceC3905l.subs(AbstractC14412l.class, C9886l.yandex);
        interfaceC3905l.subs(AbstractC10000l.class, C14057l.yandex);
        interfaceC3905l.subs(AbstractC11452l.class, C0969l.yandex);
        interfaceC3905l.subs(AbstractC7039l.class, C13465l.yandex);
        interfaceC3905l.subs(AbstractC10851l.class, C12729l.yandex);
        interfaceC3905l.subs(AbstractC1163l.class, C0747l.yandex);
        interfaceC3905l.subs(AbstractC16829l.class, C10123l.yandex);
        interfaceC3905l.subs(AbstractC7709l.class, C12415l.yandex);
        interfaceC3905l.subs(AbstractC17185l.class, C18570l.yandex);
        interfaceC3905l.subs(AbstractC12272l.class, C17854l.yandex);
        interfaceC3905l.subs(AbstractC1214l.class, C1935l.yandex);
        interfaceC3905l.subs(AbstractC13251l.class, C15134l.yandex);
        interfaceC3905l.subs(AbstractC6604l.class, C3845l.yandex);
        interfaceC3905l.subs(AbstractC3474l.class, C10767l.yandex);
        interfaceC3905l.subs(AbstractC15269l.class, C2945l.yandex);
        interfaceC3905l.subs(AbstractC10433l.class, C7965l.yandex);
        interfaceC3905l.subs(AbstractC0133l.class, C1212l.yandex);
        interfaceC3905l.subs(AbstractC3230l.class, C14021l.yandex);
        interfaceC3905l.subs(AbstractC7252l.class, C13646l.yandex);
        interfaceC3905l.subs(AbstractC11308l.class, C14221l.yandex);
        interfaceC3905l.subs(AbstractC3058l.class, C1345l.yandex);
        interfaceC3905l.subs(AbstractC11852l.class, C13988l.yandex);
        interfaceC3905l.subs(AbstractC15300l.class, C13216l.yandex);
        interfaceC3905l.subs(AbstractC17457l.class, C3698l.yandex);
        interfaceC3905l.subs(AbstractC12300l.class, C5784l.yandex);
        interfaceC3905l.subs(AbstractC10310l.class, C3929l.yandex);
        interfaceC3905l.subs(AbstractC5170l.class, C12577l.yandex);
        interfaceC3905l.subs(AbstractC17307l.class, C1888l.yandex);
        interfaceC3905l.subs(AbstractC2133l.class, C0864l.yandex);
        interfaceC3905l.subs(AbstractC1383l.class, C3080l.yandex);
        interfaceC3905l.subs(AbstractC15639l.class, C6471l.yandex);
        interfaceC3905l.subs(AbstractC9092l.class, C7458l.yandex);
        interfaceC3905l.subs(AbstractC3670l.class, C12079l.yandex);
        interfaceC3905l.subs(AbstractC11036l.class, C0727l.yandex);
        interfaceC3905l.subs(AbstractC6419l.class, C14385l.yandex);
        interfaceC3905l.subs(AbstractC10704l.class, C9324l.yandex);
        interfaceC3905l.subs(AbstractC17653l.class, C8522l.yandex);
        interfaceC3905l.subs(AbstractC17828l.class, C2971l.yandex);
        interfaceC3905l.subs(AbstractC1315l.class, C12355l.yandex);
        interfaceC3905l.subs(AbstractC17265l.class, C17519l.yandex);
        interfaceC3905l.subs(AbstractC17943l.class, C4290l.yandex);
        interfaceC3905l.subs(AbstractC13743l.class, C13257l.yandex);
        interfaceC3905l.subs(AbstractC15439l.class, C12283l.yandex);
        interfaceC3905l.subs(AbstractC11173l.class, C13193l.yandex);
        interfaceC3905l.subs(AbstractC13273l.class, C10989l.yandex);
        interfaceC3905l.subs(AbstractC16570l.class, C11855l.yandex);
        interfaceC3905l.subs(AbstractC7000l.class, C16397l.yandex);
        interfaceC3905l.subs(AbstractC7236l.class, C3690l.yandex);
        interfaceC3905l.subs(AbstractC5646l.class, C9829l.yandex);
        interfaceC3905l.subs(AbstractC11184l.class, C16260l.yandex);
        interfaceC3905l.subs(AbstractC3700l.class, C15550l.yandex);
        interfaceC3905l.subs(AbstractC14024l.class, C3213l.yandex);
        interfaceC3905l.subs(AbstractC1760l.class, C3218l.yandex);
        interfaceC3905l.subs(AbstractC7720l.class, C7120l.yandex);
        interfaceC3905l.subs(AbstractC11999l.class, C8138l.yandex);
        interfaceC3905l.subs(AbstractC2130l.class, C12926l.yandex);
        interfaceC3905l.subs(AbstractC12396l.class, C12078l.yandex);
        interfaceC3905l.subs(AbstractC9334l.class, C9003l.yandex);
        interfaceC3905l.subs(AbstractC10733l.class, C13971l.yandex);
        interfaceC3905l.subs(AbstractC11156l.class, C5315l.yandex);
        interfaceC3905l.subs(AbstractC9027l.class, C0730l.yandex);
        interfaceC3905l.subs(AbstractC5006l.class, C7770l.yandex);
        interfaceC3905l.subs(AbstractC4072l.class, C6516l.yandex);
        interfaceC3905l.subs(AbstractC12754l.class, C10040l.yandex);
        interfaceC3905l.subs(AbstractC0837l.class, C16314l.yandex);
        interfaceC3905l.subs(AbstractC6616l.class, C11953l.yandex);
        interfaceC3905l.subs(AbstractC14506l.class, C8989l.yandex);
        interfaceC3905l.subs(AbstractC11784l.class, C9360l.yandex);
        interfaceC3905l.subs(AbstractC5832l.class, C4462l.yandex);
        interfaceC3905l.subs(AbstractC18219l.class, C11742l.yandex);
        interfaceC3905l.subs(AbstractC1789l.class, C10007l.yandex);
        interfaceC3905l.subs(AbstractC9679l.class, C0314l.yandex);
        interfaceC3905l.subs(AbstractC2426l.class, C11326l.yandex);
        interfaceC3905l.subs(AbstractC6974l.class, C12049l.yandex);
        interfaceC3905l.subs(AbstractC17195l.class, C2884l.yandex);
        interfaceC3905l.subs(AbstractC7016l.class, C6010l.yandex);
        interfaceC3905l.subs(C5883l.class, C15623l.yandex);
        interfaceC3905l.subs(AbstractC5641l.class, C4328l.yandex);
        interfaceC3905l.subs(AbstractC4596l.class, C17881l.yandex);
        interfaceC3905l.subs(AbstractC3925l.class, C4809l.yandex);
        interfaceC3905l.subs(AbstractC17002l.class, C9776l.yandex);
        interfaceC3905l.subs(C12371l.class, C2949l.yandex);
        interfaceC3905l.subs(C10053l.class, C4196l.yandex);
        interfaceC3905l.subs(AbstractC6159l.class, C15336l.yandex);
        interfaceC3905l.subs(AbstractC3957l.class, C9888l.yandex);
        interfaceC3905l.subs(AbstractC16947l.class, C12793l.yandex);
        interfaceC3905l.subs(AbstractC17291l.class, C15430l.yandex);
        interfaceC3905l.subs(AbstractC7799l.class, C7440l.yandex);
        interfaceC3905l.subs(AbstractC11342l.class, C4286l.yandex);
        interfaceC3905l.subs(C4536l.class, C6076l.yandex);
        interfaceC3905l.subs(AbstractC5473l.class, C7529l.yandex);
        interfaceC3905l.subs(AbstractC9033l.class, C1934l.yandex);
        interfaceC3905l.subs(AbstractC11141l.class, C0052l.yandex);
        interfaceC3905l.subs(AbstractC14905l.class, C14712l.yandex);
        interfaceC3905l.subs(AbstractC14770l.class, C6720l.yandex);
        interfaceC3905l.subs(AbstractC1805l.class, C0351l.yandex);
        interfaceC3905l.subs(AbstractC4071l.class, C14853l.yandex);
        interfaceC3905l.subs(AbstractC8317l.class, C4432l.yandex);
        interfaceC3905l.subs(AbstractC12225l.class, C18337l.yandex);
        interfaceC3905l.subs(C2287l.class, C2161l.yandex);
        interfaceC3905l.subs(AbstractC5889l.class, C5858l.yandex);
        interfaceC3905l.subs(AbstractC2533l.class, C9454l.yandex);
        interfaceC3905l.subs(AbstractC1051l.class, C9440l.yandex);
        interfaceC3905l.subs(AbstractC11064l.class, C5271l.yandex);
        interfaceC3905l.subs(AbstractC12442l.class, C2866l.yandex);
        interfaceC3905l.subs(AbstractC17948l.class, C3420l.yandex);
        interfaceC3905l.subs(AbstractC8069l.class, C15171l.yandex);
        interfaceC3905l.subs(AbstractC2296l.class, C1684l.yandex);
        interfaceC3905l.subs(AbstractC0622l.class, C13908l.yandex);
        interfaceC3905l.subs(AbstractC4447l.class, C0810l.yandex);
        interfaceC3905l.subs(AbstractC5518l.class, C10225l.yandex);
        interfaceC3905l.subs(AbstractC15235l.class, C16087l.yandex);
        interfaceC3905l.subs(AbstractC17780l.class, C0533l.yandex);
        interfaceC3905l.subs(AbstractC0775l.class, C9688l.yandex);
        interfaceC3905l.subs(AbstractC2438l.class, C16263l.yandex);
        interfaceC3905l.subs(AbstractC17551l.class, C12913l.yandex);
        interfaceC3905l.subs(AbstractC16759l.class, C9517l.yandex);
        interfaceC3905l.subs(AbstractC13359l.class, C0765l.yandex);
        interfaceC3905l.subs(AbstractC14205l.class, C15065l.yandex);
        interfaceC3905l.subs(AbstractC8265l.class, C0623l.yandex);
        interfaceC3905l.subs(AbstractC1762l.class, C12341l.yandex);
        interfaceC3905l.subs(AbstractC9592l.class, C15147l.yandex);
        interfaceC3905l.subs(AbstractC9307l.class, C18637l.yandex);
        interfaceC3905l.subs(AbstractC8182l.class, C6424l.yandex);
        interfaceC3905l.subs(AbstractC10999l.class, C3290l.yandex);
        interfaceC3905l.subs(AbstractC7303l.class, C13605l.yandex);
        interfaceC3905l.subs(AbstractC12027l.class, C8693l.yandex);
        interfaceC3905l.subs(AbstractC8441l.class, C2409l.yandex);
        interfaceC3905l.subs(AbstractC3352l.class, C16322l.yandex);
        interfaceC3905l.subs(AbstractC7209l.class, C17402l.yandex);
        interfaceC3905l.subs(AbstractC15342l.class, C17705l.yandex);
        interfaceC3905l.subs(AbstractC7076l.class, C4158l.yandex);
        interfaceC3905l.subs(AbstractC7822l.class, C7350l.yandex);
        interfaceC3905l.subs(AbstractC1889l.class, C7642l.yandex);
        interfaceC3905l.subs(AbstractC2576l.class, C18442l.yandex);
        interfaceC3905l.subs(AbstractC17860l.class, C6828l.yandex);
        interfaceC3905l.subs(AbstractC15918l.class, C14752l.yandex);
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return AbstractC5103l.billing((Executor) c11644l.mo622l(new C12638l(InterfaceC1444l.class, Executor.class)));
    }

    public Signature[] smaato(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.InterfaceC11210l
    public InterfaceC6942l subs() {
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        if (c5198lM3161l != null) {
            C16287l.yandex.getClass();
            InterfaceC6942l interfaceC6942lAdcel = AbstractC4338l.adcel(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{Long.valueOf(C16287l.crashlytics())}, 1)));
            if (interfaceC6942lAdcel != null) {
                return new C13900l(interfaceC6942lAdcel, 15);
            }
        }
        return new C14970l(5, C11507l.f23131l);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C17058l c17058l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C15164l c15164l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C10961l c10961l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C10265l c10265l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f36050l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C17058l) {
                    c17058l = (C17058l) abstractC0283l;
                    int i2 = c17058l.f33217l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17058l.f33217l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17058l = new C17058l(this, abstractC0283l);
                    }
                } else {
                    c17058l = new C17058l(this, abstractC0283l);
                }
                Object objYandex = c17058l.f33218l;
                int i3 = c17058l.f33217l;
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
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C2757l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c17058l.f33217l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c17058l);
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
                if (abstractC0283l instanceof C15164l) {
                    c15164l = (C15164l) abstractC0283l;
                    int i4 = c15164l.f29753l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15164l.f29753l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15164l = new C15164l(this, abstractC0283l);
                    }
                } else {
                    c15164l = new C15164l(this, abstractC0283l);
                }
                Object objYandex2 = c15164l.f29754l;
                int i5 = c15164l.f29753l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c15164l.f29753l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c15164l);
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
                if (abstractC0283l instanceof C10961l) {
                    c10961l = (C10961l) abstractC0283l;
                    int i6 = c10961l.f22094l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10961l.f22094l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10961l = new C10961l(this, abstractC0283l);
                    }
                } else {
                    c10961l = new C10961l(this, abstractC0283l);
                }
                Object objYandex3 = c10961l.f22095l;
                int i7 = c10961l.f22094l;
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
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C5984l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c10961l.f22094l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c10961l);
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
                if (abstractC0283l instanceof C10265l) {
                    c10265l = (C10265l) abstractC0283l;
                    int i8 = c10265l.f20896l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10265l.f20896l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10265l = new C10265l(this, abstractC0283l);
                    }
                } else {
                    c10265l = new C10265l(this, abstractC0283l);
                }
                Object objYandex4 = c10265l.f20897l;
                int i9 = c10265l.f20896l;
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
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7660l.class)));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c10265l.f20896l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c10265l);
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
        switch (this.f36050l) {
            case 7:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC18565l
    public float vip(float f) {
        double d = f;
        return (float) (d < 0.001953d ? d * 16.0d : AbstractC16358l.billing(d, 0.5555555555555556d));
    }

    @Override // defpackage.InterfaceC16011l
    public AbstractC18041l yandex() {
        throw new IllegalStateException("This method should not be called");
    }
}

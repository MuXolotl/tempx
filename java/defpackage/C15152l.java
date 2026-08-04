package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import javax.crypto.KeyAgreement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15152l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29738l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15152l f29725l = new C15152l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15152l f29721l = new C15152l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15152l f29731l = new C15152l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15152l f29730l = new C15152l(3);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C15152l f29734l = new C15152l(4);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C15152l f29722l = new C15152l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15152l f29723l = new C15152l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C15152l f29733l = new C15152l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C15152l f29728l = new C15152l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C15152l f29735l = new C15152l(9);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C15152l f29732l = new C15152l(10);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C15152l f29720l = new C15152l(11);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C15152l f29736l = new C15152l(12);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C15152l f29729l = new C15152l(13);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C15152l f29724l = new C15152l(14);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C15152l f29727l = new C15152l(15);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C15152l f29737l = new C15152l(16);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C15152l f29726l = new C15152l(17);

    public C15152l(C13183l c13183l) {
        this.f29738l = 18;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        int i = this.f29738l;
        Class cls = Void.TYPE;
        switch (i) {
            case 0:
                return new C9735l(AbstractC12953l.loadAd(1308617531));
            case 1:
                C11457l c11457l = C11457l.yandex;
                InterfaceC2504l interfaceC2504l = (InterfaceC2504l) AbstractC16901l.m4234private(ServiceLoader.load(InterfaceC2504l.class, InterfaceC2504l.class.getClassLoader()));
                if (interfaceC2504l != null) {
                    return interfaceC2504l;
                }
                C8339l.smaato("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new C9735l(C9735l.loadAd);
            case 3:
                return new C9735l(C9735l.loadAd);
            case 4:
                return new C9735l(C9735l.loadAd);
            case 5:
                C11669l c11669l = new C11669l(new C16412l("DefaultBuiltIns"));
                c11669l.crashlytics();
                return c11669l;
            case 6:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC10552l.f21459l;
                return cls;
            case 7:
                Set set = C17367l.loadAd;
                return C2580l.f5619l;
            case 8:
                C8123l c8123l = C8123l.f16928l;
                return (C11669l) C11669l.billing.getValue();
            case 9:
                return null;
            case 10:
                InterfaceC13922l[] interfaceC13922lArr2 = C15036l.mopub;
                return Collections.singletonMap(AbstractC7012l.yandex, new C7391l("Deprecated in Java"));
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                C17744l c17744l = C17744l.yandex;
                List listM4213const = AbstractC16901l.m4213const(ServiceLoader.load(InterfaceC12157l.class, InterfaceC12157l.class.getClassLoader()));
                if (!listM4213const.isEmpty()) {
                    return listM4213const;
                }
                C8339l.smaato("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 15:
                return "There is more input to consume";
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC13012l interfaceC13012l = AbstractC1806l.yandex;
                return cls;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                throw null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AlgorithmParameters.getInstance("EC");
            case 20:
                return KeyAgreement.getInstance("ECDH");
            default:
                return KeyFactory.getInstance("EC");
        }
    }

    public /* synthetic */ C15152l(int i) {
        this.f29738l = i;
    }
}

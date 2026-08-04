package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10351l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21144l;

    public /* synthetic */ C10351l(int i) {
        this.f21144l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        InterfaceC13012l interfaceC13012lAmazon;
        int i = 2;
        boolean z = true;
        C16076l c16076l = 0;
        int i2 = 0;
        switch (this.f21144l) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                C12825l c12825l = (C12825l) obj;
                List listM4213const = AbstractC16901l.m4213const(((C13791l) c12825l.loadAd).yandex);
                c12825l.yandex.f32917l.mopub(AbstractC3180l.amazon, listM4213const);
                C7171l c7171l = new C7171l();
                C2336l c2336l = AbstractC18202l.yandex;
                InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(Map.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lAmazon = c2336l.amazon(c2336l.remoteconfig(c2336l.loadAd(Map.class), Arrays.asList(AbstractC12953l.smaato(AbstractC18202l.yandex(C5808l.class)), AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE))), false));
                    break;
                } catch (Throwable unused) {
                    interfaceC13012lAmazon = null;
                }
                C11911l c11911l = new C11911l("ProviderVersionAttributeKey", new C11310l(interfaceC1388lLoadAd, interfaceC13012lAmazon));
                c12825l.yandex(C13863l.f27119l, new C14139l(listM4213const, c7171l, c11911l, null));
                c12825l.yandex(C17334l.f33661l, new C1411l(c12825l, listM4213const, c7171l, c11911l, null));
                return Unit.INSTANCE;
            case 2:
                return ((MainArtist) obj).crashlytics;
            case 3:
                InterfaceC5059l interfaceC5059l = (InterfaceC5059l) obj;
                return Boolean.valueOf(!interfaceC5059l.getParameters().isEmpty() && AbstractC0891l.crashlytics((AbstractC9707l) interfaceC5059l.getParameters().get(0), AbstractC0891l.crashlytics));
            case 4:
                List parameters = ((InterfaceC5059l) obj).getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (!((AbstractC9707l) it.next()).mo1108private() && (i2 = i2 + 1) < 0) {
                            AbstractC14055l.ads();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i2);
            case 5:
                return Integer.valueOf(((InterfaceC5059l) obj).getParameters().size());
            case 6:
                C11303l c11303l = (C11303l) obj;
                c11303l.crashlytics(AbstractC11621l.loadAd, (int) (c11303l.yandex().smaato() >> 32));
                c11303l.crashlytics(AbstractC11621l.yandex, 0.0f);
                return Unit.INSTANCE;
            case 7:
                return ((C3597l) obj).f7530l;
            case 8:
                Throwable th = (Throwable) obj;
                th.printStackTrace();
                throw th;
            case 9:
                ((Throwable) obj).printStackTrace();
                return Unit.INSTANCE;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + " = " + ((String) entry.getValue());
            case 11:
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob((InterfaceC17593l) obj, C2056l.crashlytics);
                return Unit.INSTANCE;
            case 12:
                return new C18574l(((Context) obj).getContentResolver());
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 16:
                C12825l c12825l2 = (C12825l) obj;
                int i3 = 3;
                c12825l2.yandex(C14823l.f29003l, new C17095l(i3, (InterfaceC14029l) c16076l, (int) (z ? 1 : 0)));
                c12825l2.yandex(C11140l.f22366l, new C2051l(i, c16076l, i3));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C6742l) obj).yandex();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                if (((Context) ((InterfaceC4191l) obj).mo539this(AbstractC1242l.loadAd)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC10872l.loadAd;
                }
                InterfaceC14447l.yandex.getClass();
                return C18498l.crashlytics;
            case 21:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case 22:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case 23:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 0);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((CharSequence) obj).toString();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                String str = (String) obj;
                C16076l c16076l2 = VKXApplication.f36632l;
                return (c16076l2 != null ? c16076l2 : 0).f31521l.subs(str);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                String str2 = (String) obj;
                C16076l c16076l3 = VKXApplication.f36632l;
                return (c16076l3 != null ? c16076l3 : null).f31521l.subs(str2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C7591l c7591l = (C7591l) obj;
                AbstractC2786l controller = c7591l.getController();
                C18089l c18089l = controller instanceof C18089l ? (C18089l) controller : null;
                if (c18089l != null) {
                    AbstractC12225l.crashlytics();
                    c18089l.f35374package = null;
                    c18089l.remoteconfig = null;
                    C12404l c12404l = c18089l.vip;
                    if (c12404l != null) {
                        c12404l.yandex.yandex.appmetrica();
                    }
                }
                c7591l.setController(null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ViewParent parent = ((C7591l) obj).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                }
                return Unit.INSTANCE;
            default:
                ((C6148l) obj).crashlytics(0.8f);
                return Unit.INSTANCE;
        }
    }
}

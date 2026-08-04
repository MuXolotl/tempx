package defpackage;

import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؙۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6335l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6335l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f13288l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C8108l c8108l;
        Function0 function0;
        int i = 2;
        int i2 = 3;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        switch (this.f13288l) {
            case 0:
                ((C7044l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case 1:
                ((C12752l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case 2:
                C12752l c12752l = (C12752l) this.f26698l;
                if ((((Boolean) c12752l.f25123l.getValue()).booleanValue() || c12752l.m3501abstract().f1623l) && (c12752l.m3501abstract() != EnumC0442l.Monet || AbstractC11173l.crashlytics())) {
                    EnumC0442l enumC0442lM3501abstract = c12752l.m3501abstract();
                    C13802l c13802l = new C13802l(6, c12752l);
                    C5374l c5374lYandex = AbstractC16584l.yandex();
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    AbstractC4072l.pro(c5374lYandex, vKXApplication != null ? vKXApplication : null, new C0464l(enumC0442lM3501abstract, c13802l, 7));
                }
                return Unit.INSTANCE;
            case 3:
                ((C12221l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case 4:
                C12221l c12221l = (C12221l) this.f26698l;
                c12221l.f24281l.setValue((String) c12221l.f24279l.getValue());
                String str = (String) c12221l.f24281l.getValue();
                C2462l c2462lLoadAd = str.length() == 0 ? C2462l.loadAd : C2462l.loadAd(str);
                ExecutorC12937l executorC12937l = AbstractC10242l.f20861l;
                Objects.requireNonNull(c2462lLoadAd);
                if (Build.VERSION.SDK_INT < 33) {
                    if (!c2462lLoadAd.equals(AbstractC10242l.f20857l)) {
                        synchronized (AbstractC10242l.f20859l) {
                            AbstractC10242l.f20857l = c2462lLoadAd;
                            AbstractC10242l.loadAd();
                        }
                    }
                    break;
                } else {
                    Object objCrashlytics = AbstractC10242l.crashlytics();
                    if (objCrashlytics != null) {
                        AbstractC3962l.loadAd(objCrashlytics, AbstractC2292l.yandex(c2462lLoadAd.yandex.yandex()));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                C4456l c4456l = (C4456l) this.f26698l;
                List listAdmob = c4456l.f9075l.admob();
                if (listAdmob.size() == 1) {
                    C2900l c2900l = (C2900l) AbstractC16901l.m4217extends(listAdmob);
                    if (c2900l != null) {
                        c2900l.crashlytics.invoke(c4456l.f5081l);
                    }
                    c4456l.m1548package();
                } else {
                    c4456l.m1549synchronized(EnumC16462l.f32184l);
                }
                return Unit.INSTANCE;
            case 6:
                return ((C4456l) this.f26698l).f5081l;
            case 7:
                ((C4456l) this.f26698l).purchase();
                return Unit.INSTANCE;
            case 8:
                ((C4456l) this.f26698l).subs();
                return Unit.INSTANCE;
            case 9:
                ((C13530l) this.f26698l).billing();
                return Unit.INSTANCE;
            case 10:
                ((C9879l) this.f26698l).mopub();
                return Unit.INSTANCE;
            case 11:
                AbstractC9033l.crashlytics(((C9879l) this.f26698l).yandex, new C18160l(i, b == true ? 1 : 0, i2));
                return Unit.INSTANCE;
            case 12:
                ((C9879l) this.f26698l).admob();
                return Unit.INSTANCE;
            case 13:
                ((C4975l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case 14:
                C13330l c13330l = (C13330l) this.f26698l;
                Function0 function1 = c13330l.f26175l;
                c13330l.f26173l = true;
                function1.invoke();
                c13330l.purchase();
                return Unit.INSTANCE;
            case 15:
                C13330l c13330l2 = (C13330l) this.f26698l;
                Function0 function2 = c13330l2.f26170l;
                c13330l2.f26173l = true;
                function2.invoke();
                c13330l2.purchase();
                return Unit.INSTANCE;
            case 16:
                ((C10655l) this.f26698l).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C13797l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C8948l) this.f26698l).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C1050l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case 20:
                C3464l c3464l = (C3464l) this.f26698l;
                C10023l c10023l = c3464l.loadAd;
                if (c10023l != null && (c8108l = (C8108l) c10023l.f20418l) != null && (function0 = c8108l.billing) != null) {
                    function0.invoke();
                }
                c3464l.loadAd = null;
                return Unit.INSTANCE;
            case 21:
                return ((InterfaceC15209l) this.f26698l).mo1544default();
            case 22:
                ((C1026l) this.f26698l).purchase();
                return Unit.INSTANCE;
            case 23:
                C1026l c1026l = (C1026l) this.f26698l;
                c1026l.getClass();
                C16552l c16552l = AbstractC11463l.yandex;
                AbstractC10999l.mopub(c1026l, ExecutorC6708l.f14063l, 0, new C11039l(c1026l, b2 == true ? 1 : 0, 23), 2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C13046l) this.f26698l).purchase();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C16854l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16854l c16854l = (C16854l) this.f26698l;
                c16854l.m4201finally(true);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c16854l), null, 0, new C11039l(c16854l, b3 == true ? 1 : 0, 27), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C4560l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4560l c4560l = (C4560l) this.f26698l;
                c4560l.f9229l.setValue(Boolean.TRUE);
                c4560l.f9236l.setValue("");
                AbstractC10999l.mopub(AbstractC11990l.firebase(c4560l), null, 0, new C11039l(c4560l, b4 == true ? 1 : 0, 28), 3);
                return Unit.INSTANCE;
            default:
                ((C0996l) this.f26698l).mo1143default();
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0289l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f1307l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1308l;

    public /* synthetic */ C0289l(InterfaceC8714l interfaceC8714l, int i) {
        this.f1308l = i;
        this.f1307l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f1308l;
        InterfaceC8714l interfaceC8714l = this.f1307l;
        switch (i) {
            case 0:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) interfaceC8714l.getValue();
                if (interfaceC18212l != null) {
                    return interfaceC18212l;
                }
                AbstractC14825l.amazon("Required value was null.");
                C17132l.firebase();
                return null;
            case 1:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                interfaceC8714l.setValue(Boolean.valueOf(!((Boolean) interfaceC8714l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 3:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 4:
                InterfaceC18212l interfaceC18212l2 = (InterfaceC18212l) interfaceC8714l.getValue();
                if (interfaceC18212l2 != null) {
                    return interfaceC18212l2;
                }
                AbstractC14825l.amazon("Required value was null.");
                C17132l.firebase();
                return null;
            case 5:
                if (interfaceC8714l != null) {
                    return (List) interfaceC8714l.getValue();
                }
                return null;
            case 6:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                Boolean bool = (Boolean) interfaceC8714l.getValue();
                bool.booleanValue();
                return bool;
            case 9:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                interfaceC8714l.setValue(null);
                return Unit.INSTANCE;
            case 13:
                interfaceC8714l.setValue(Boolean.FALSE);
                C6782l.yandex.getClass();
                SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                SharedPreferences.Editor editorEdit = (sharedPreferences != null ? sharedPreferences : null).edit();
                editorEdit.putBoolean("misc_donatepopup", true);
                editorEdit.apply();
                return Unit.INSTANCE;
            case 14:
                interfaceC8714l.setValue(AbstractC16584l.loadAd().subs());
                return Unit.INSTANCE;
            case 15:
                interfaceC8714l.setValue(null);
                return Unit.INSTANCE;
            case 16:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC8714l.setValue(Boolean.valueOf(!((Boolean) interfaceC8714l.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C13964l((Function1) interfaceC8714l.getValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (InterfaceC3074l) ((Function0) interfaceC8714l.getValue()).invoke();
            case 20:
                return new C1336l((Function1) interfaceC8714l.getValue());
            case 21:
                return new C14543l((Function1) interfaceC8714l.getValue());
            case 22:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 23:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                interfaceC8714l.setValue(EnumC16913l.SOCKS5);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                interfaceC8714l.setValue(EnumC16913l.HTTP);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC18212l interfaceC18212l3 = (InterfaceC18212l) interfaceC8714l.getValue();
                if (interfaceC18212l3 != null) {
                    return interfaceC18212l3;
                }
                AbstractC14825l.amazon("Required value was null.");
                C17132l.firebase();
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                interfaceC8714l.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                interfaceC8714l.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}

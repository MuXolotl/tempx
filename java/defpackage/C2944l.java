package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2944l extends C1538l implements Function0 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2944l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f6410l = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        int i = this.f6410l;
        int i2 = 23;
        int i3 = 7;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                ((C13849l) obj).mo1143default();
                break;
            case 1:
                ((C5766l) obj).mo1143default();
                break;
            case 2:
                ((InterfaceC4138l) obj).purchase();
                break;
            case 3:
                ((InterfaceC4138l) obj).purchase();
                break;
            case 4:
                ((C13659l) obj).mo1143default();
                break;
            case 5:
                ((C9991l) obj).mo1143default();
                break;
            case 6:
                C11864l c11864l = (C11864l) obj;
                c11864l.yandex.mo2154l(new C8250l(i3, c11864l));
                AbstractC10999l.subs(C17218l.f33421l, new C8912l(c11864l.loadAd, interfaceC14029l, i2));
                break;
            case 7:
                C11864l c11864l2 = (C11864l) obj;
                c11864l2.yandex.mo2154l(new C8250l(i3, c11864l2));
                AbstractC10999l.subs(C17218l.f33421l, new C8912l(c11864l2.loadAd, interfaceC14029l, i2));
                break;
            case 8:
                ((C9430l) obj).mo1143default();
                break;
            case 9:
                ((C15068l) obj).mo1143default();
                break;
            case 10:
                C15068l c15068l = (C15068l) obj;
                c15068l.f29600l.setValue(Boolean.FALSE);
                C8195l c8195l = c15068l.f29595l;
                if (c8195l != null) {
                    c15068l.m4125private(new C17398l(((Number) c8195l.f17098l).intValue(), 12, ((Number) c8195l.f17097l).longValue(), (String) null));
                }
                break;
            case 11:
                C15068l c15068l2 = (C15068l) obj;
                c15068l2.f29600l.setValue(Boolean.FALSE);
                c15068l2.f29597l.setValue(Boolean.TRUE);
                break;
            case 12:
                C15068l c15068l3 = (C15068l) obj;
                c15068l3.getClass();
                C15068l.m3920this(c15068l3, null, true, 1);
                break;
            case 13:
                C4077l c4077l = (C4077l) obj;
                c4077l.f8379l = true;
                c4077l.f8380l.invoke(AbstractC8676l.metrica(c4077l.f8382l, Collections.singletonMap("captcha_key", (String) c4077l.f8383l.getValue())));
                c4077l.purchase();
                break;
            case 14:
                ((C5891l) obj).mo1143default();
                break;
            case 15:
                ((C12000l) obj).mo1143default();
                break;
            case 16:
                ((C12000l) obj).mo1143default();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C5039l) obj).mo1143default();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C5039l) obj).mo1143default();
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C6433l) obj).mo1143default();
                break;
            case 20:
                ((C6433l) obj).mo1143default();
                break;
            case 21:
                ((C18014l) obj).mo1143default();
                break;
            case 22:
                ((C18014l) obj).mo1143default();
                break;
            case 23:
                ((C18014l) obj).mo1143default();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C18014l) obj).mo1143default();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C18014l) obj).mo1143default();
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C7044l) obj).mo1143default();
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C7044l) obj).mo1143default();
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C7044l) obj).mo1143default();
                break;
            default:
                ((C7044l) obj).mo1143default();
                break;
        }
        return Unit.INSTANCE;
    }
}

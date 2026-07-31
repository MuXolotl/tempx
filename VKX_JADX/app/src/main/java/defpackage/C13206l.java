package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؚْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13206l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25976l;

    public /* synthetic */ C13206l(int i) {
        this.f25976l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f25976l) {
            case 0:
                return ((AbstractC18643l) obj).getYandex();
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return new C10218l((Context) obj);
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 7:
                return Boolean.TRUE;
            case 8:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 9:
                return Boolean.TRUE;
            case 10:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 11:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 12:
                return Boolean.valueOf(!(((InterfaceC18302l) obj) instanceof C9077l));
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                C2261l c2261l = (C2261l) obj;
                return Float.valueOf(C2261l.yandex(c2261l.yandex) * C2261l.loadAd(c2261l.yandex));
            case 16:
                return Float.valueOf(C2261l.loadAd(((C2261l) obj).yandex));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (C14724l) obj;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Integer.valueOf(((CharSequence) obj).length());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (InterfaceC4141l) obj;
            case 20:
                return AbstractC16676l.billing((AudioTrack) obj);
            case 21:
                String str = ((C1358l) obj).amazon;
                return str == null ? "" : str;
            case 22:
                C7315l c7315l = ((C3597l) obj).f7530l;
                if (c7315l != null && c7315l.f15171l) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                C15744l c15744l = ((C3597l) obj).f7529l;
                if (c15744l != null && c15744l.f30927l) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C15744l c15744l2 = ((C3597l) obj).f7533l;
                if (c15744l2 != null && c15744l2.f30927l) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return (C3597l) obj;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Boolean.FALSE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C3554l c3554l = ((C3597l) obj).f7528l;
                return Boolean.valueOf(!AbstractC8576l.yandex(c3554l != null ? c3554l.f7471l : null, "flat"));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C18364l c18364l = ((C3597l) obj).f7520l;
                if (c18364l != null && c18364l.f35878l) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                C1887l c1887l = ((C3597l) obj).f7521l;
                if (c1887l != null && c1887l.f4316l) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

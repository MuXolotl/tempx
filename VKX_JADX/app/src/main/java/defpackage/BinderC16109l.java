package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٖٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC16109l extends Binder implements IInterface {
    public final C5835l purchase;

    public BinderC16109l(C5835l c5835l) {
        attachInterface(this, "bruhcollective.itaysonlab.libvkx.ILibVkxService");
        this.purchase = c5835l;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.os.Parcel] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws Throwable {
        Parcel parcel3;
        long jCrashlytics;
        long jCrashlytics2;
        int i3 = 1;
        if (i < 1 || i > 16777215) {
            parcel3 = parcel;
        } else {
            parcel3 = parcel;
            parcel3.enforceInterface("bruhcollective.itaysonlab.libvkx.ILibVkxService");
        }
        if (i == 1598968902) {
            parcel2.writeString("bruhcollective.itaysonlab.libvkx.ILibVkxService");
            return true;
        }
        C17218l c17218l = C17218l.f33421l;
        int i4 = 2;
        int i5 = 0;
        i = 0;
        int i6 = 0;
        i5 = 0;
        ?? r14 = 0;
        C5835l c5835l = this.purchase;
        switch (i) {
            case 2:
                c5835l.billing(parcel3.readInt(), parcel3.readString(), parcel3.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 3:
                if (c5835l.amazon.m1190l()) {
                    C16287l.yandex.getClass();
                    jCrashlytics = C16287l.crashlytics();
                } else {
                    jCrashlytics = 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt((int) jCrashlytics);
                return true;
            case 4:
                c5835l.loadAd(parcel3.readInt(), parcel3.readInt(), parcel3.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                int i7 = parcel3.readInt();
                long j = parcel3.readInt();
                C2494l c2494l = c5835l.amazon;
                C17119l c17119l = new C17119l(c5835l, i7, j);
                if (c2494l.m1190l()) {
                    c17119l.invoke();
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i8 = parcel3.readInt();
                long j2 = parcel3.readInt();
                if (c5835l.amazon.m1190l()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j2);
                    sb.append('_');
                    sb.append(i8);
                    String string = sb.toString();
                    C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                    if ((c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null) != null) {
                        i5 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case 7:
                List list = c5835l.amazon.m1190l() ? (List) AbstractC10999l.subs(c17218l, new C8345l(c5835l, r14, i3)) : C2580l.f5619l;
                parcel2.writeNoException();
                parcel2.writeStringList(list);
                return true;
            case 8:
                c5835l.crashlytics(parcel3.readInt(), parcel3.readInt(), parcel3.readString());
                parcel2.writeNoException();
                return true;
            case 9:
                int i9 = parcel3.readInt();
                int i10 = parcel3.readInt();
                String string2 = parcel3.readString();
                long j3 = i10;
                if (c5835l.amazon.m1190l()) {
                    C5835l.amazon(j3, i9, string2, new C2613l(7));
                    Unit unit = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case 10:
                int i11 = parcel3.readInt();
                int i12 = parcel3.readInt();
                String string3 = parcel3.readString();
                long j4 = i12;
                if (c5835l.amazon.m1190l()) {
                    C5835l.amazon(j4, i11, string3, new C2613l(6));
                    Unit unit2 = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case 11:
                int i13 = parcel3.readInt();
                long j5 = parcel3.readInt();
                if (c5835l.amazon.m1190l()) {
                    AbstractC10999l.subs(C17218l.f33421l, new C16469l(i13, j5, null, 1));
                    Unit unit3 = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case 12:
                String str = (String) AbstractC10999l.subs(c17218l, new C15127l(2, null, 4));
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                List list2 = (List) AbstractC10999l.subs(c17218l, new C8041l(Integer.parseInt(parcel3.readString()), Long.parseLong(parcel3.readString()), AbstractC9968l.yandex(VKXApplication.f36629l, AbstractC18202l.yandex(AudioTrack.class)), null));
                parcel2.writeNoException();
                parcel2.writeStringList(list2);
                return true;
            case 14:
                String str2 = (String) AbstractC10999l.subs(c17218l, new C9932l(Integer.parseInt(parcel3.readString()), Long.parseLong(parcel3.readString()), null));
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 15:
                ?? BooleanValue = c5835l.amazon.m1190l() ? ((Boolean) AbstractC10999l.subs(c17218l, new C16469l(parcel3.readInt(), parcel3.readInt(), null, 0))).booleanValue() : 0;
                parcel2.writeNoException();
                parcel2.writeInt(BooleanValue);
                return true;
            case 16:
                if (c5835l.amazon.m1190l()) {
                    C16287l.yandex.getClass();
                    jCrashlytics2 = C16287l.crashlytics();
                } else {
                    jCrashlytics2 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeLong(jCrashlytics2);
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c5835l.loadAd(parcel3.readLong(), parcel3.readInt(), parcel3.readString());
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i14 = parcel3.readInt();
                long j6 = parcel3.readLong();
                C2494l c2494l2 = c5835l.amazon;
                C17119l c17119l2 = new C17119l(c5835l, i14, j6);
                if (c2494l2.m1190l()) {
                    c17119l2.invoke();
                }
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int i15 = parcel3.readInt();
                long j7 = parcel3.readLong();
                if (c5835l.amazon.m1190l()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j7);
                    sb2.append('_');
                    sb2.append(i15);
                    String string4 = sb2.toString();
                    C5198l c5198lM3161l2 = C6336l.loadAd.m3161l();
                    if ((c5198lM3161l2 != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l2.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string4}, 1))) : null) != null) {
                        i6 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            case 20:
                c5835l.crashlytics(parcel3.readLong(), parcel3.readInt(), parcel3.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                int i16 = parcel3.readInt();
                long j8 = parcel3.readLong();
                String string5 = parcel3.readString();
                if (c5835l.amazon.m1190l()) {
                    C5835l.amazon(j8, i16, string5, new C2613l(7));
                    Unit unit4 = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case 22:
                int i17 = parcel3.readInt();
                long j9 = parcel3.readLong();
                String string6 = parcel3.readString();
                if (c5835l.amazon.m1190l()) {
                    C5835l.amazon(j9, i17, string6, new C2613l(6));
                    Unit unit5 = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case 23:
                int i18 = parcel3.readInt();
                long j10 = parcel3.readLong();
                if (c5835l.amazon.m1190l()) {
                    AbstractC10999l.subs(C17218l.f33421l, new C16469l(i18, j10, null, 1));
                    Unit unit6 = Unit.INSTANCE;
                }
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ?? BooleanValue2 = c5835l.amazon.m1190l() ? ((Boolean) AbstractC10999l.subs(c17218l, new C16469l(parcel3.readInt(), parcel3.readLong(), null, 0))).booleanValue() : 0;
                parcel2.writeNoException();
                parcel2.writeInt(BooleanValue2);
                return true;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                long j11 = parcel3.readLong();
                int i19 = parcel3.readInt();
                int i20 = parcel3.readInt();
                c5835l.getClass();
                String str3 = (String) AbstractC10999l.subs(c17218l, new C12420l(i19, i20, j11, null, c5835l));
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int i21 = parcel3.readInt();
                int i22 = parcel3.readInt();
                c5835l.getClass();
                String str4 = (String) AbstractC10999l.subs(c17218l, new C11061l(c5835l, i21, i22, null));
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                String string7 = parcel3.readString();
                int i23 = parcel3.readInt();
                int i24 = parcel3.readInt();
                if (string7 != null) {
                    c5835l.getClass();
                    r14 = (String) AbstractC10999l.subs(c17218l, new C11789l(c5835l, string7, i23, i24, (InterfaceC14029l) null));
                }
                parcel2.writeNoException();
                parcel2.writeString(r14);
                return true;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long j12 = parcel3.readLong();
                if (c5835l.amazon.m1190l()) {
                    if (j12 != 0) {
                        C16287l.yandex.getClass();
                        if (j12 != C16287l.crashlytics()) {
                            Unit unit7 = Unit.INSTANCE;
                        } else {
                            Unit unit8 = Unit.INSTANCE;
                        }
                    } else {
                        Unit unit9 = Unit.INSTANCE;
                    }
                }
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                c5835l.getClass();
                String str5 = (String) AbstractC10999l.subs(c17218l, new C11061l(c5835l, 0, 0, null));
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 30:
                C16076l c16076l = VKXApplication.f36632l;
                int iOrdinal = (c16076l != null ? c16076l : null).purchase().ordinal();
                if (iOrdinal == 0) {
                    i4 = 0;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C18725l.billing();
                        return false;
                    }
                    i4 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            case 31:
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                C10507l c10507lCrashlytics = c16076l2.crashlytics();
                AbstractC18643l abstractC18643l = c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null;
                AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
                String strMopub = audioTrack != null ? AbstractC16676l.mopub(audioTrack) : null;
                parcel2.writeNoException();
                parcel2.writeString(strMopub);
                return true;
            case 32:
                C16076l c16076l3 = VKXApplication.f36632l;
                if (c16076l3 == null) {
                    c16076l3 = null;
                }
                C16811l c16811l = c16076l3.f31499l;
                if (c16811l != null ? c16811l.f32834l.mo319l() : false) {
                    C16076l c16076l4 = VKXApplication.f36632l;
                    if (c16076l4 == null) {
                        c16076l4 = null;
                    }
                    if (c16076l4.purchase() == EnumC11447l.f23032l) {
                        C16076l c16076l5 = VKXApplication.f36632l;
                        (c16076l5 != null ? c16076l5 : null).isPro();
                    } else {
                        C16076l c16076l6 = VKXApplication.f36632l;
                        (c16076l6 != null ? c16076l6 : null).smaato();
                    }
                }
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                String string8 = parcel3.readString();
                C16076l c16076l7 = VKXApplication.f36632l;
                ?? Crashlytics = string8 != null ? (c16076l7 != null ? c16076l7 : null).f31521l.admob.crashlytics(string8) : 0;
                parcel2.writeNoException();
                parcel2.writeInt(Crashlytics);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                String string9 = parcel3.readString();
                boolean z = parcel3.readInt() != 0;
                if (string9 != null) {
                    c5835l.getClass();
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    AbstractC10999l.mopub(vKXApplication, new C16989l(C13772l.f26879l, 2), 0, new C10291l(null, string9, z), 2);
                }
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

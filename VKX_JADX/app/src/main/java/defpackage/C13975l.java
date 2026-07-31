package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import androidx.car.app.navigation.model.Maneuver;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13975l implements InterfaceC2165l, InterfaceC1541l, InterfaceC15756l, InterfaceC7102l, InterfaceC12684l, InterfaceC15244l, InterfaceC9765l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C13975l f27265l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27271l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27262l = new C13975l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27268l = new C13975l(18);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27267l = new C13975l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27270l = new C13975l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27263l = new C13975l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27264l = new C13975l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27269l = new C13975l(23);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C13975l f27266l = new C13975l(24);

    public /* synthetic */ C13975l(int i) {
        this.f27271l = i;
    }

    public static boolean admob(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    public static final String amazon(C3844l c3844l, C3844l[] c3844lArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C3844l c3844l2 = C2127l.loadAd;
        int iPurchase = c3844l.purchase();
        int i5 = 0;
        while (i5 < iPurchase) {
            int i6 = (i5 + iPurchase) / 2;
            while (i6 > -1 && c3844l.isPro(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (c3844l.isPro(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bIsPro = c3844lArr[i10].isPro(i11);
                    byte[] bArr = AbstractC7712l.yandex;
                    int i13 = bIsPro & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bIsPro2 = c3844l.isPro(i7 + i12);
                byte[] bArr2 = AbstractC7712l.yandex;
                i4 = i3 - (bIsPro2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (c3844lArr[i10].purchase() != i11) {
                    z2 = z;
                } else {
                    if (i10 == c3844lArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iPurchase2 = c3844lArr[i10].purchase() - i11;
                    int length = c3844lArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iPurchase2 += c3844lArr[i15].purchase();
                    }
                    if (iPurchase2 >= i14) {
                        if (iPurchase2 <= i14) {
                            return c3844l.startapp(i7, i9 + i7).metrica(AbstractC9050l.yandex);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iPurchase = i6;
        }
        return null;
    }

    public static AbstractC2371l mopub(int i, int i2, C15617l c15617l, C4220l c4220l, C8259l c8259l, C5565l c5565l, C5959l c5959l, Size size, String str) {
        C15617l c15617l2 = C15617l.f30495l;
        C15617l c15617l3 = (i2 & 8) != 0 ? c15617l2 : c15617l;
        C4220l c4220l2 = (i2 & 64) != 0 ? null : c4220l;
        C5565l c5565l2 = (i2 & 128) != 0 ? null : c5565l;
        C5959l c5959l2 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c5959l;
        C15617l c15617l4 = C15617l.f30503l;
        C2580l c2580l = C2580l.f5619l;
        if (c15617l3 == c15617l4 || c15617l3 == C15617l.f30509l || ((c15617l3 == C15617l.f30508l || c15617l3 == C15617l.f30490l) && Build.VERSION.SDK_INT >= 35)) {
            return new C13930l(size, i, str, c15617l3, c8259l, c4220l2, c5565l2, c5959l2, c2580l);
        }
        if (c15617l3 == c15617l2) {
            return new C1386l(size, i, str, c8259l, c4220l2, c5565l2, c5959l2, c2580l);
        }
        C8339l.smaato("Check failed.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[PHI: r10
  0x0021: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:18:0x0031, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x007a A[RETURN] */
    public static boolean subs(int i, int i2, long j, boolean z, boolean z2, C6879l c6879l) {
        long j2;
        long j3;
        boolean zAdmob = admob(i, z2);
        if (zAdmob) {
            Log.d("CXCP", "shouldRetry: Active resume mode is activated");
        }
        if (zAdmob) {
            j2 = 1800000000000L;
            if (c6879l != null) {
                j3 = c6879l.yandex;
                if (C6879l.yandex(1800000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        } else {
            j2 = 10000000000L;
            if (c6879l != null) {
                j3 = c6879l.yandex;
                if (C6879l.yandex(10000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        }
        if (C6879l.yandex(j, j2) <= 0) {
            if (i == 0) {
                if (i2 <= 1) {
                    return true;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (!z || i2 <= 1) {
                            }
                        } else if (i != 4 && i != 5 && i != 6 && i != 7) {
                            if (i == 8) {
                                if (i2 <= 1) {
                                }
                            } else if (i != 10) {
                                if (i != 11) {
                                    Log.e("CXCP", "Unexpected CameraError: " + C15712l.subs);
                                    return false;
                                }
                                if (i2 <= 1) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 || i2 <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC12684l
    public int billing(byte[] bArr) {
        int length = bArr.length - 1;
        int i = bArr[length] & 255;
        int i2 = -1;
        int i3 = 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            i2 &= (((bArr[length] & 255) ^ i) - 1) >> 31;
            i3 -= i2;
        }
    }

    @Override // defpackage.InterfaceC12684l
    public int crashlytics(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = 0;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i - 1] & 1) == 0) {
            i2 = 255;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // defpackage.InterfaceC1541l
    public C11911l getKey() {
        return C13308l.crashlytics;
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC7102l
    public CharSequence purchase(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f425l.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        switch (this.f27271l) {
            case 15:
                return new C2782l(0);
            default:
                return new C16543l(c11644l.m3178l(C2187l.class));
        }
    }

    @Override // defpackage.InterfaceC1541l
    public Object vip(Function1 function1) {
        function1.invoke(new C10819l(3));
        return new C13308l();
    }

    @Override // defpackage.InterfaceC1541l
    public void yandex(C16864l c16864l, Object obj) {
        c16864l.f32922l.firebase(C8403l.f17390l, new C15469l((C13308l) obj, c16864l, null));
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f27271l) {
            case 16:
                return new Boolean(((Boolean) C13588l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                return new Boolean(((Boolean) C0604l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(600000L, 48, "measurement.sgtm.upload.min_delay_after_background").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.config.url_scheme", 8, "https").get();
            case 20:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(50L, 21, "measurement.experiment.max_ids").get()).longValue());
            case 21:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
            case 22:
                List list5 = AbstractC5981l.yandex;
                return (Boolean) C8775l.yandex.get();
            case 23:
                List list6 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.service", true, 6).get();
        }
    }

    @Override // defpackage.InterfaceC12684l
    public void smaato(SecureRandom secureRandom) {
    }
}

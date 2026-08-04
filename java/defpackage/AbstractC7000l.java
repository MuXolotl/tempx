package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* JADX INFO: renamed from: lؚؓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7000l {
    public static final C15578l yandex = new C15578l(-489887388, false, new C12851l(20));
    public static final C15578l loadAd = new C15578l(1629163587, false, new C12851l(21));
    public static final C15578l crashlytics = new C15578l(-546752734, false, new C12851l(22));
    public static final C15578l amazon = new C15578l(1572298241, false, new C12851l(23));

    public static final String amazon(InterfaceC15071l interfaceC15071l) {
        return (String) ((C1080l) AbstractC5715l.yandex(interfaceC15071l)).f2976l;
    }

    public static final String billing(InterfaceC14280l interfaceC14280l) {
        return AbstractC12024l.m3351while((String) ((C1080l) AbstractC5715l.yandex(interfaceC14280l)).f2976l, '?');
    }

    public static String crashlytics(C4966l c4966l) {
        StringBuilder sb = new StringBuilder(c4966l.size());
        for (int i = 0; i < c4966l.size(); i++) {
            byte bAmazon = c4966l.amazon(i);
            if (bAmazon == 34) {
                sb.append("\\\"");
            } else if (bAmazon == 39) {
                sb.append("\\'");
            } else if (bAmazon != 92) {
                switch (bAmazon) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bAmazon < 32 || bAmazon > 126) {
                            sb.append('\\');
                            sb.append((char) (((bAmazon >>> 6) & 3) + 48));
                            sb.append((char) (((bAmazon >>> 3) & 7) + 48));
                            sb.append((char) ((bAmazon & 7) + 48));
                        } else {
                            sb.append((char) bAmazon);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean loadAd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean purchase(C15736l c15736l) {
        Boolean bool;
        try {
            bool = (Boolean) ((C10861l) c15736l.loadAd).crashlytics(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (AbstractC17919l.yandex(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && AbstractC5088l.metrica()) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final C5254l yandex(InterfaceC14280l interfaceC14280l) {
        String strSignatures = interfaceC14280l.yandex().signatures("Content-Type");
        if (strSignatures != null) {
            C5254l c5254l = C5254l.f11335l;
            C5254l c5254lAdmob = AbstractC10033l.admob(strSignatures);
            if (c5254lAdmob != null) {
                return c5254lAdmob;
            }
        }
        return C5254l.f11335l;
    }
}

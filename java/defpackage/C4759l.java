package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lًؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4759l {
    public static final int[] amazon = {0, 4, 8};
    public static final SparseIntArray billing;
    public static final SparseIntArray purchase;
    public final HashMap yandex = new HashMap();
    public final boolean loadAd = true;
    public final HashMap crashlytics = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        purchase = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        billing = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void billing(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C7222l c7222l;
        C4298l c4298l;
        C8950l c8950l;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof C8950l) {
                    c8950l = (C8950l) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c8950l).width = i4;
                        c8950l.f18454static = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c8950l).height = i4;
                        c8950l.f18436default = z;
                        return;
                    }
                }
                if (obj instanceof C4298l) {
                    c4298l = (C4298l) obj;
                    if (i2 == 0) {
                        c4298l.loadAd = i4;
                        c4298l.f8812protected = z;
                        return;
                    } else {
                        c4298l.crashlytics = i4;
                        c4298l.f8825while = z;
                        return;
                    }
                }
                if (obj instanceof C7222l) {
                    c7222l = (C7222l) obj;
                    if (i2 == 0) {
                        c7222l.loadAd(23, i4);
                        c7222l.amazon(80, z);
                        return;
                    } else {
                        c7222l.loadAd(21, i4);
                        c7222l.amazon(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof C8950l) {
                c8950l = (C8950l) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c8950l).width = i4;
                    c8950l.f18454static = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c8950l).height = i4;
                    c8950l.f18436default = z;
                    return;
                }
            }
            if (obj instanceof C4298l) {
                c4298l = (C4298l) obj;
                if (i2 == 0) {
                    c4298l.loadAd = i4;
                    c4298l.f8812protected = z;
                    return;
                } else {
                    c4298l.crashlytics = i4;
                    c4298l.f8825while = z;
                    return;
                }
            }
            if (obj instanceof C7222l) {
                c7222l = (C7222l) obj;
                if (i2 == 0) {
                    c7222l.loadAd(23, i4);
                    c7222l.amazon(80, z);
                    return;
                } else {
                    c7222l.loadAd(21, i4);
                    c7222l.amazon(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C8950l) {
                    C8950l c8950l2 = (C8950l) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c8950l2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c8950l2).height = 0;
                    }
                    mopub(c8950l2, strTrim2);
                    return;
                }
                if (obj instanceof C4298l) {
                    ((C4298l) obj).advert = strTrim2;
                    return;
                } else {
                    if (obj instanceof C7222l) {
                        ((C7222l) obj).crashlytics(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof C8950l) {
                        C8950l c8950l3 = (C8950l) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c8950l3).width = 0;
                            c8950l3.f18458synchronized = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c8950l3).height = 0;
                            c8950l3.f18455strictfp = f;
                            return;
                        }
                    }
                    if (obj instanceof C4298l) {
                        C4298l c4298l2 = (C4298l) obj;
                        if (i2 == 0) {
                            c4298l2.loadAd = 0;
                            c4298l2.f8794class = f;
                            return;
                        } else {
                            c4298l2.crashlytics = 0;
                            c4298l2.f8796continue = f;
                            return;
                        }
                    }
                    if (obj instanceof C7222l) {
                        C7222l c7222l2 = (C7222l) obj;
                        if (i2 == 0) {
                            c7222l2.loadAd(23, 0);
                            c7222l2.yandex(39, f);
                            return;
                        } else {
                            c7222l2.loadAd(21, 0);
                            c7222l2.yandex(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C8950l) {
                        C8950l c8950l4 = (C8950l) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c8950l4).width = 0;
                            c8950l4.f18431case = fMax;
                            c8950l4.f18450private = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c8950l4).height = 0;
                            c8950l4.f18457switch = fMax;
                            c8950l4.f18438extends = 2;
                            return;
                        }
                    }
                    if (obj instanceof C4298l) {
                        C4298l c4298l3 = (C4298l) obj;
                        if (i2 == 0) {
                            c4298l3.loadAd = 0;
                            c4298l3.f8790abstract = fMax;
                            c4298l3.f8797default = 2;
                            return;
                        } else {
                            c4298l3.crashlytics = 0;
                            c4298l3.f8806instanceof = fMax;
                            c4298l3.f8800final = 2;
                            return;
                        }
                    }
                    if (obj instanceof C7222l) {
                        C7222l c7222l3 = (C7222l) obj;
                        if (i2 == 0) {
                            c7222l3.loadAd(23, 0);
                            c7222l3.loadAd(54, 2);
                        } else {
                            c7222l3.loadAd(21, 0);
                            c7222l3.loadAd(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static C5609l crashlytics(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C5609l c5609l = new C5609l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC4914l.crashlytics : AbstractC4914l.yandex);
        C1235l c1235l = c5609l.loadAd;
        C3330l c3330l = c5609l.purchase;
        C12730l c12730l = c5609l.crashlytics;
        C4298l c4298l = c5609l.amazon;
        int[] iArr = amazon;
        String[] strArr = AbstractC5711l.yandex;
        SparseIntArray sparseIntArray = purchase;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C7222l c7222l = new C7222l();
            c7222l.yandex = new int[10];
            c7222l.loadAd = new int[10];
            c7222l.crashlytics = 0;
            c7222l.amazon = new int[10];
            c7222l.purchase = new float[10];
            c7222l.billing = 0;
            c7222l.mopub = new int[5];
            c7222l.admob = new String[5];
            c7222l.subs = 0;
            c7222l.isPro = new int[4];
            c7222l.firebase = new boolean[4];
            c7222l.smaato = 0;
            c12730l.getClass();
            c4298l.getClass();
            c3330l.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (billing.get(index)) {
                    case 2:
                        i2 = i3;
                        c7222l.loadAd(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8815strictfp));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = i3;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = i3;
                        c7222l.crashlytics(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 6:
                        i2 = i3;
                        c7222l.loadAd(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4298l.applovin));
                        break;
                    case 7:
                        i2 = i3;
                        c7222l.loadAd(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4298l.appmetrica));
                        break;
                    case 8:
                        i2 = i3;
                        c7222l.loadAd(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8824volatile));
                        break;
                    case 11:
                        i2 = i3;
                        c7222l.loadAd(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8793catch));
                        break;
                    case 12:
                        i2 = i3;
                        c7222l.loadAd(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8798else));
                        break;
                    case 13:
                        i2 = i3;
                        c7222l.loadAd(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8799extends));
                        break;
                    case 14:
                        i2 = i3;
                        c7222l.loadAd(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8820throw));
                        break;
                    case 15:
                        i2 = i3;
                        c7222l.loadAd(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8792case));
                        break;
                    case 16:
                        i2 = i3;
                        c7222l.loadAd(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8802for));
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i2 = i3;
                        c7222l.loadAd(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4298l.amazon));
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        i2 = i3;
                        c7222l.loadAd(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c4298l.purchase));
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        i2 = i3;
                        c7222l.yandex(19, typedArrayObtainStyledAttributes.getFloat(index, c4298l.billing));
                        break;
                    case 20:
                        i2 = i3;
                        c7222l.yandex(20, typedArrayObtainStyledAttributes.getFloat(index, c4298l.pro));
                        break;
                    case 21:
                        i2 = i3;
                        c7222l.loadAd(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c4298l.crashlytics));
                        break;
                    case 22:
                        i2 = i3;
                        c7222l.loadAd(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c1235l.yandex)]);
                        break;
                    case 23:
                        i2 = i3;
                        c7222l.loadAd(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c4298l.loadAd));
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        i2 = i3;
                        c7222l.loadAd(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8821throws));
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i2 = i3;
                        c7222l.loadAd(27, typedArrayObtainStyledAttributes.getInt(index, c4298l.inmobi));
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        i2 = i3;
                        c7222l.loadAd(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8810package));
                        break;
                    case 31:
                        i2 = i3;
                        c7222l.loadAd(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8808native));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        i2 = i3;
                        c7222l.loadAd(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8818synchronized));
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        i2 = i3;
                        c7222l.yandex(37, typedArrayObtainStyledAttributes.getFloat(index, c4298l.ad));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        i2 = i3;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c5609l.yandex);
                        c5609l.yandex = resourceId;
                        c7222l.loadAd(38, resourceId);
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i2 = i3;
                        c7222l.yandex(39, typedArrayObtainStyledAttributes.getFloat(index, c4298l.f8794class));
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        i2 = i3;
                        c7222l.yandex(40, typedArrayObtainStyledAttributes.getFloat(index, c4298l.f8796continue));
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        i2 = i3;
                        c7222l.loadAd(41, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8807interface));
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        i2 = i3;
                        c7222l.loadAd(42, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8814static));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        i2 = i3;
                        c7222l.yandex(43, typedArrayObtainStyledAttributes.getFloat(index, c1235l.crashlytics));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        i2 = i3;
                        c7222l.amazon(44, true);
                        c7222l.yandex(44, typedArrayObtainStyledAttributes.getDimension(index, c3330l.remoteconfig));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        i2 = i3;
                        c7222l.yandex(45, typedArrayObtainStyledAttributes.getFloat(index, c3330l.loadAd));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        i2 = i3;
                        c7222l.yandex(46, typedArrayObtainStyledAttributes.getFloat(index, c3330l.crashlytics));
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        i2 = i3;
                        c7222l.yandex(47, typedArrayObtainStyledAttributes.getFloat(index, c3330l.amazon));
                        break;
                    case 48:
                        i2 = i3;
                        c7222l.yandex(48, typedArrayObtainStyledAttributes.getFloat(index, c3330l.purchase));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i2 = i3;
                        c7222l.yandex(49, typedArrayObtainStyledAttributes.getDimension(index, c3330l.billing));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i2 = i3;
                        c7222l.yandex(50, typedArrayObtainStyledAttributes.getDimension(index, c3330l.mopub));
                        break;
                    case 51:
                        i2 = i3;
                        c7222l.yandex(51, typedArrayObtainStyledAttributes.getDimension(index, c3330l.subs));
                        break;
                    case 52:
                        i2 = i3;
                        c7222l.yandex(52, typedArrayObtainStyledAttributes.getDimension(index, c3330l.isPro));
                        break;
                    case 53:
                        i2 = i3;
                        c7222l.yandex(53, typedArrayObtainStyledAttributes.getDimension(index, c3330l.firebase));
                        break;
                    case 54:
                        i2 = i3;
                        c7222l.loadAd(54, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8797default));
                        break;
                    case 55:
                        i2 = i3;
                        c7222l.loadAd(55, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8800final));
                        break;
                    case 56:
                        i2 = i3;
                        c7222l.loadAd(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8809new));
                        break;
                    case 57:
                        i2 = i3;
                        c7222l.loadAd(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8803goto));
                        break;
                    case 58:
                        i2 = i3;
                        c7222l.loadAd(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8816super));
                        break;
                    case 59:
                        i2 = i3;
                        c7222l.loadAd(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8805import));
                        break;
                    case 60:
                        i2 = i3;
                        c7222l.yandex(60, typedArrayObtainStyledAttributes.getFloat(index, c3330l.yandex));
                        break;
                    case 62:
                        i2 = i3;
                        c7222l.loadAd(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.signatures));
                        break;
                    case 63:
                        i2 = i3;
                        c7222l.yandex(63, typedArrayObtainStyledAttributes.getFloat(index, c4298l.premium));
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        i2 = i3;
                        c7222l.loadAd(64, purchase(typedArrayObtainStyledAttributes, index, c12730l.yandex));
                        break;
                    case 65:
                        i2 = i3;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c7222l.crashlytics(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c7222l.crashlytics(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = i3;
                        c7222l.loadAd(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        c7222l.yandex(67, typedArrayObtainStyledAttributes.getFloat(index, c12730l.purchase));
                        break;
                    case 68:
                        i2 = i3;
                        c7222l.yandex(68, typedArrayObtainStyledAttributes.getFloat(index, c1235l.amazon));
                        break;
                    case 69:
                        i2 = i3;
                        c7222l.yandex(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = i3;
                        c7222l.yandex(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        c7222l.loadAd(72, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8813public));
                        break;
                    case 73:
                        i2 = i3;
                        c7222l.loadAd(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8801finally));
                        break;
                    case 74:
                        i2 = i3;
                        c7222l.crashlytics(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        c7222l.amazon(75, typedArrayObtainStyledAttributes.getBoolean(index, c4298l.f8804implements));
                        break;
                    case 76:
                        i2 = i3;
                        c7222l.loadAd(76, typedArrayObtainStyledAttributes.getInt(index, c12730l.crashlytics));
                        break;
                    case 77:
                        i2 = i3;
                        c7222l.crashlytics(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        c7222l.loadAd(78, typedArrayObtainStyledAttributes.getInt(index, c1235l.loadAd));
                        break;
                    case 79:
                        i2 = i3;
                        c7222l.yandex(79, typedArrayObtainStyledAttributes.getFloat(index, c12730l.amazon));
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i2 = i3;
                        c7222l.amazon(80, typedArrayObtainStyledAttributes.getBoolean(index, c4298l.f8812protected));
                        break;
                    case 81:
                        i2 = i3;
                        c7222l.amazon(81, typedArrayObtainStyledAttributes.getBoolean(index, c4298l.f8825while));
                        break;
                    case 82:
                        i2 = i3;
                        c7222l.loadAd(82, typedArrayObtainStyledAttributes.getInteger(index, c12730l.loadAd));
                        break;
                    case 83:
                        i2 = i3;
                        c7222l.loadAd(83, purchase(typedArrayObtainStyledAttributes, index, c3330l.admob));
                        break;
                    case 84:
                        i2 = i3;
                        c7222l.loadAd(84, typedArrayObtainStyledAttributes.getInteger(index, c12730l.mopub));
                        break;
                    case 85:
                        i2 = i3;
                        c7222l.yandex(85, typedArrayObtainStyledAttributes.getFloat(index, c12730l.billing));
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c12730l.subs = resourceId2;
                            c7222l.loadAd(89, resourceId2);
                            if (c12730l.subs != -1) {
                                c7222l.loadAd(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c12730l.admob = string;
                            c7222l.crashlytics(90, string);
                            if (c12730l.admob.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c12730l.subs = resourceId3;
                                c7222l.loadAd(89, resourceId3);
                                c7222l.loadAd(88, -2);
                            } else {
                                c7222l.loadAd(88, -1);
                            }
                        } else {
                            c7222l.loadAd(88, typedArrayObtainStyledAttributes.getInteger(index, c12730l.subs));
                        }
                        break;
                    case 87:
                        i2 = i3;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = i3;
                        c7222l.loadAd(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8811private));
                        break;
                    case 94:
                        i2 = i3;
                        c7222l.loadAd(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c4298l.f8817switch));
                        break;
                    case 95:
                        i2 = i3;
                        billing(c7222l, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i2 = i3;
                        billing(c7222l, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        c7222l.loadAd(97, typedArrayObtainStyledAttributes.getInt(index, c4298l.f8795const));
                        break;
                    case 98:
                        i2 = i3;
                        int i6 = AbstractC14365l.f28113l;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c5609l.yandex = typedArrayObtainStyledAttributes.getResourceId(index, c5609l.yandex);
                        }
                        break;
                    case 99:
                        i2 = i3;
                        c7222l.amazon(99, typedArrayObtainStyledAttributes.getBoolean(index, c4298l.mopub));
                        break;
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c12730l.getClass();
                        c4298l.getClass();
                        c3330l.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c4298l.startapp = purchase(typedArrayObtainStyledAttributes, index2, c4298l.startapp);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c4298l.f8815strictfp = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8815strictfp);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c4298l.metrica = purchase(typedArrayObtainStyledAttributes, index2, c4298l.metrica);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c4298l.vip = purchase(typedArrayObtainStyledAttributes, index2, c4298l.vip);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c4298l.advert = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c4298l.applovin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4298l.applovin);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c4298l.appmetrica = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4298l.appmetrica);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c4298l.f8824volatile = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8824volatile);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c4298l.license = purchase(typedArrayObtainStyledAttributes, index2, c4298l.license);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c4298l.Signature = purchase(typedArrayObtainStyledAttributes, index2, c4298l.Signature);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c4298l.f8793catch = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8793catch);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c4298l.f8798else = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8798else);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c4298l.f8799extends = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8799extends);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c4298l.f8820throw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8820throw);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c4298l.f8792case = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8792case);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c4298l.f8802for = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8802for);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i = indexCount2;
                        c4298l.amazon = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4298l.amazon);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        i = indexCount2;
                        c4298l.purchase = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c4298l.purchase);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        i = indexCount2;
                        c4298l.billing = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.billing);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c4298l.pro = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.pro);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c4298l.crashlytics = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c4298l.crashlytics);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c1235l.yandex);
                        c1235l.yandex = i8;
                        c1235l.yandex = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c4298l.loadAd = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c4298l.loadAd);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        i = indexCount2;
                        c4298l.f8821throws = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8821throws);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        i = indexCount2;
                        c4298l.admob = purchase(typedArrayObtainStyledAttributes, index2, c4298l.admob);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        i = indexCount2;
                        c4298l.subs = purchase(typedArrayObtainStyledAttributes, index2, c4298l.subs);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i = indexCount2;
                        c4298l.inmobi = typedArrayObtainStyledAttributes.getInt(index2, c4298l.inmobi);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        i = indexCount2;
                        c4298l.f8810package = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8810package);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        i = indexCount2;
                        c4298l.isPro = purchase(typedArrayObtainStyledAttributes, index2, c4298l.isPro);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c4298l.firebase = purchase(typedArrayObtainStyledAttributes, index2, c4298l.firebase);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c4298l.f8808native = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8808native);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c4298l.subscription = purchase(typedArrayObtainStyledAttributes, index2, c4298l.subscription);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        i = indexCount2;
                        c4298l.tapsense = purchase(typedArrayObtainStyledAttributes, index2, c4298l.tapsense);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        i = indexCount2;
                        c4298l.f8818synchronized = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8818synchronized);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        i = indexCount2;
                        c4298l.remoteconfig = purchase(typedArrayObtainStyledAttributes, index2, c4298l.remoteconfig);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        i = indexCount2;
                        c4298l.smaato = purchase(typedArrayObtainStyledAttributes, index2, c4298l.smaato);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        i = indexCount2;
                        c4298l.ad = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.ad);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        i = indexCount2;
                        c5609l.yandex = typedArrayObtainStyledAttributes.getResourceId(index2, c5609l.yandex);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i = indexCount2;
                        c4298l.f8794class = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.f8794class);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        i = indexCount2;
                        c4298l.f8796continue = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.f8796continue);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        i = indexCount2;
                        c4298l.f8807interface = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8807interface);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        i = indexCount2;
                        c4298l.f8814static = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8814static);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        i = indexCount2;
                        c1235l.crashlytics = typedArrayObtainStyledAttributes.getFloat(index2, c1235l.crashlytics);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        i = indexCount2;
                        c3330l.smaato = true;
                        c3330l.remoteconfig = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.remoteconfig);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        i = indexCount2;
                        c3330l.loadAd = typedArrayObtainStyledAttributes.getFloat(index2, c3330l.loadAd);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        i = indexCount2;
                        c3330l.crashlytics = typedArrayObtainStyledAttributes.getFloat(index2, c3330l.crashlytics);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        i = indexCount2;
                        c3330l.amazon = typedArrayObtainStyledAttributes.getFloat(index2, c3330l.amazon);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c3330l.purchase = typedArrayObtainStyledAttributes.getFloat(index2, c3330l.purchase);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i = indexCount2;
                        c3330l.billing = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.billing);
                        continue;
                        i7++;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i = indexCount2;
                        c3330l.mopub = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.mopub);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c3330l.subs = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.subs);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c3330l.isPro = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.isPro);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c3330l.firebase = typedArrayObtainStyledAttributes.getDimension(index2, c3330l.firebase);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c4298l.f8797default = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8797default);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c4298l.f8800final = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8800final);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c4298l.f8809new = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8809new);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c4298l.f8803goto = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8803goto);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c4298l.f8816super = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8816super);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c4298l.f8805import = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8805import);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c3330l.yandex = typedArrayObtainStyledAttributes.getFloat(index2, c3330l.yandex);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c4298l.isVip = purchase(typedArrayObtainStyledAttributes, index2, c4298l.isVip);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c4298l.signatures = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.signatures);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c4298l.premium = typedArrayObtainStyledAttributes.getFloat(index2, c4298l.premium);
                        continue;
                        i7++;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        i = indexCount2;
                        c12730l.yandex = purchase(typedArrayObtainStyledAttributes, index2, c12730l.yandex);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c12730l.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c12730l.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c12730l.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c12730l.purchase = typedArrayObtainStyledAttributes.getFloat(index2, c12730l.purchase);
                        break;
                    case 68:
                        i = indexCount2;
                        c1235l.amazon = typedArrayObtainStyledAttributes.getFloat(index2, c1235l.amazon);
                        break;
                    case 69:
                        i = indexCount2;
                        c4298l.f8790abstract = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c4298l.f8806instanceof = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c4298l.f8813public = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8813public);
                        break;
                    case 73:
                        i = indexCount2;
                        c4298l.f8801finally = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8801finally);
                        break;
                    case 74:
                        i = indexCount2;
                        c4298l.f8791break = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c4298l.f8804implements = typedArrayObtainStyledAttributes.getBoolean(index2, c4298l.f8804implements);
                        break;
                    case 76:
                        i = indexCount2;
                        c12730l.crashlytics = typedArrayObtainStyledAttributes.getInt(index2, c12730l.crashlytics);
                        break;
                    case 77:
                        i = indexCount2;
                        c4298l.f8822transient = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c1235l.loadAd = typedArrayObtainStyledAttributes.getInt(index2, c1235l.loadAd);
                        break;
                    case 79:
                        i = indexCount2;
                        c12730l.amazon = typedArrayObtainStyledAttributes.getFloat(index2, c12730l.amazon);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i = indexCount2;
                        c4298l.f8812protected = typedArrayObtainStyledAttributes.getBoolean(index2, c4298l.f8812protected);
                        break;
                    case 81:
                        i = indexCount2;
                        c4298l.f8825while = typedArrayObtainStyledAttributes.getBoolean(index2, c4298l.f8825while);
                        break;
                    case 82:
                        i = indexCount2;
                        c12730l.loadAd = typedArrayObtainStyledAttributes.getInteger(index2, c12730l.loadAd);
                        break;
                    case 83:
                        i = indexCount2;
                        c3330l.admob = purchase(typedArrayObtainStyledAttributes, index2, c3330l.admob);
                        break;
                    case 84:
                        i = indexCount2;
                        c12730l.mopub = typedArrayObtainStyledAttributes.getInteger(index2, c12730l.mopub);
                        break;
                    case 85:
                        i = indexCount2;
                        c12730l.billing = typedArrayObtainStyledAttributes.getFloat(index2, c12730l.billing);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c12730l.subs = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c12730l.admob = string2;
                            if (string2.indexOf("/") > 0) {
                                c12730l.subs = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c12730l.subs);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c4298l.adcel = purchase(typedArrayObtainStyledAttributes, index2, c4298l.adcel);
                        break;
                    case 92:
                        i = indexCount2;
                        c4298l.ads = purchase(typedArrayObtainStyledAttributes, index2, c4298l.ads);
                        break;
                    case 93:
                        i = indexCount2;
                        c4298l.f8811private = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8811private);
                        break;
                    case 94:
                        i = indexCount2;
                        c4298l.f8817switch = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c4298l.f8817switch);
                        break;
                    case 95:
                        i = indexCount2;
                        billing(c4298l, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i = indexCount2;
                        billing(c4298l, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c4298l.f8795const = typedArrayObtainStyledAttributes.getInt(index2, c4298l.f8795const);
                        break;
                }
                i7++;
            }
            if (c4298l.f8791break != null) {
                c4298l.f8823try = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c5609l;
    }

    public static int[] loadAd(C18254l c18254l, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c18254l.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC15049l.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c18254l.isInEditMode() && (c18254l.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c18254l.getParent();
                if (AbstractC2812l.advert(strTrim)) {
                    HashMap map = constraintLayout.f341l;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f341l.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static void mopub(C8950l c8950l, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c8950l.f18449package = str;
    }

    public static int purchase(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void amazon(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C5609l c5609lCrashlytics = crashlytics(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c5609lCrashlytics.amazon.yandex = true;
                    }
                    this.crashlytics.put(Integer.valueOf(c5609lCrashlytics.yandex), c5609lCrashlytics);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    public final void yandex(Context context, int i) {
        ConstraintLayout constraintLayout;
        int i2;
        HashMap map;
        int i3;
        int i4;
        C4759l c4759l = this;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout2.getChildCount();
        HashMap map2 = c4759l.crashlytics;
        map2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            C8950l c8950l = (C8950l) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c4759l.loadAd && id == -1) {
                C18073l.license("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C5609l());
            }
            C5609l c5609l = (C5609l) map2.get(Integer.valueOf(id));
            if (c5609l == null) {
                constraintLayout = constraintLayout2;
                i2 = childCount;
                map = map2;
                i3 = i5;
            } else {
                C1235l c1235l = c5609l.loadAd;
                C4298l c4298l = c5609l.amazon;
                C3330l c3330l = c5609l.purchase;
                constraintLayout = constraintLayout2;
                HashMap map3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                map = map2;
                HashMap map4 = c4759l.yandex;
                for (String str : map4.keySet()) {
                    C16420l c16420l = (C16420l) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                map3.put(str, new C16420l(c16420l, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                StringBuilder sbIsVip = AbstractC5020l.isVip(" Custom Attribute \"", str, "\" not found on ");
                                sbIsVip.append(cls.getName());
                                Log.e("TransitionLayout", sbIsVip.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                StringBuilder sbIsVip2 = AbstractC5020l.isVip(" Custom Attribute \"", str, "\" not found on ");
                                sbIsVip2.append(cls.getName());
                                Log.e("TransitionLayout", sbIsVip2.toString(), e);
                            }
                        } else {
                            i4 = i5;
                            map3.put(str, new C16420l(c16420l, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        i4 = i5;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        i4 = i5;
                    }
                    map4 = map5;
                    i5 = i4;
                }
                i3 = i5;
                c5609l.billing = map3;
                c5609l.yandex = id;
                c4298l.admob = c8950l.purchase;
                c4298l.subs = c8950l.billing;
                c4298l.isPro = c8950l.mopub;
                c4298l.firebase = c8950l.admob;
                c4298l.smaato = c8950l.subs;
                c4298l.remoteconfig = c8950l.isPro;
                c4298l.vip = c8950l.firebase;
                c4298l.metrica = c8950l.smaato;
                c4298l.startapp = c8950l.remoteconfig;
                c4298l.adcel = c8950l.vip;
                c4298l.ads = c8950l.metrica;
                c4298l.subscription = c8950l.subscription;
                c4298l.tapsense = c8950l.tapsense;
                c4298l.Signature = c8950l.Signature;
                c4298l.license = c8950l.license;
                c4298l.pro = c8950l.inmobi;
                c4298l.ad = c8950l.f18461throws;
                c4298l.advert = c8950l.f18449package;
                c4298l.isVip = c8950l.startapp;
                c4298l.signatures = c8950l.adcel;
                c4298l.premium = c8950l.ads;
                c4298l.applovin = c8950l.f18435continue;
                c4298l.appmetrica = c8950l.f18433class;
                c4298l.inmobi = c8950l.f18446interface;
                c4298l.billing = c8950l.crashlytics;
                c4298l.amazon = c8950l.yandex;
                c4298l.purchase = c8950l.loadAd;
                c4298l.loadAd = ((ViewGroup.MarginLayoutParams) c8950l).width;
                c4298l.crashlytics = ((ViewGroup.MarginLayoutParams) c8950l).height;
                c4298l.f8821throws = ((ViewGroup.MarginLayoutParams) c8950l).leftMargin;
                c4298l.f8810package = ((ViewGroup.MarginLayoutParams) c8950l).rightMargin;
                c4298l.f8818synchronized = ((ViewGroup.MarginLayoutParams) c8950l).topMargin;
                c4298l.f8815strictfp = ((ViewGroup.MarginLayoutParams) c8950l).bottomMargin;
                c4298l.f8811private = c8950l.appmetrica;
                c4298l.f8796continue = c8950l.f18455strictfp;
                c4298l.f8794class = c8950l.f18458synchronized;
                c4298l.f8814static = c8950l.f18447native;
                c4298l.f8807interface = c8950l.f18464volatile;
                c4298l.f8812protected = c8950l.f18454static;
                c4298l.f8825while = c8950l.f18436default;
                c4298l.f8797default = c8950l.f18450private;
                c4298l.f8800final = c8950l.f18438extends;
                c4298l.f8809new = c8950l.f18432catch;
                c4298l.f8803goto = c8950l.f18437else;
                c4298l.f8816super = c8950l.f18441for;
                c4298l.f8805import = c8950l.f18460throw;
                c4298l.f8790abstract = c8950l.f18431case;
                c4298l.f8806instanceof = c8950l.f18457switch;
                c4298l.f8822transient = c8950l.f18439final;
                c4298l.f8802for = c8950l.ad;
                c4298l.f8793catch = c8950l.isVip;
                c4298l.f8799extends = c8950l.pro;
                c4298l.f8820throw = c8950l.advert;
                c4298l.f8792case = c8950l.signatures;
                c4298l.f8798else = c8950l.premium;
                c4298l.f8817switch = c8950l.applovin;
                c4298l.f8795const = c8950l.f18448new;
                c4298l.f8824volatile = c8950l.getMarginEnd();
                c4298l.f8808native = c8950l.getMarginStart();
                c1235l.yandex = childAt.getVisibility();
                c1235l.crashlytics = childAt.getAlpha();
                c3330l.yandex = childAt.getRotation();
                c3330l.loadAd = childAt.getRotationX();
                c3330l.crashlytics = childAt.getRotationY();
                c3330l.amazon = childAt.getScaleX();
                c3330l.purchase = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c3330l.billing = pivotX;
                    c3330l.mopub = pivotY;
                }
                c3330l.subs = childAt.getTranslationX();
                c3330l.isPro = childAt.getTranslationY();
                c3330l.firebase = childAt.getTranslationZ();
                if (c3330l.smaato) {
                    c3330l.remoteconfig = childAt.getElevation();
                }
                if (childAt instanceof C18254l) {
                    C18254l c18254l = (C18254l) childAt;
                    c4298l.f8804implements = c18254l.getAllowsGoneWidget();
                    c4298l.f8823try = c18254l.getReferencedIds();
                    c4298l.f8813public = c18254l.getType();
                    c4298l.f8801finally = c18254l.getMargin();
                }
            }
            i5 = i3 + 1;
            c4759l = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
            map2 = map;
        }
    }
}

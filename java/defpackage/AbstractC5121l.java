package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.util.Log;
import android.util.Range;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗۘۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5121l {
    public static void Signature(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void adcel(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static CharSequence admob(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void ads(View view) {
        view.setImportantForContentCapture(1);
    }

    public static final Set amazon(CameraManager cameraManager) {
        return cameraManager.getConcurrentCameraIds();
    }

    public static void billing(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static String crashlytics(Context context) {
        return context.getAttributionTag();
    }

    public static boolean firebase() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static Insets isPro(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void license(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AbstractC6427l.subs("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static Icon loadAd(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final void metrica(CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.setCameraAudioRestriction(i);
    }

    public static ArrayList mopub(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    public static C13187l pro(MediaRoute2Info mediaRoute2Info) {
        int i;
        if (mediaRoute2Info != null) {
            C10038l c10038l = new C10038l(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            Bundle bundle = (Bundle) c10038l.f20463l;
            bundle.putInt("connectionState", mediaRoute2Info.getConnectionState());
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(AbstractC5917l.firebase(mediaRoute2Info)));
                int iSubscription = AbstractC5917l.subscription(mediaRoute2Info);
                i = 2;
                if (iSubscription == 2) {
                    i = 12;
                } else if (iSubscription == 3) {
                    i = 13;
                } else if (iSubscription == 4) {
                    i = 14;
                } else if (iSubscription == 22) {
                    i = 20;
                } else if (iSubscription == 23) {
                    i = 21;
                } else if (iSubscription == 26) {
                    i = 22;
                } else if (iSubscription == 29) {
                    i = 24;
                } else if (iSubscription != 2000) {
                    switch (iSubscription) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (iSubscription) {
                                case 1001:
                                    i = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i = 1000;
                }
            } else {
                i = 0;
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                if (i == 0) {
                    i = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                bundle.putInt("deviceType", i);
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    c10038l.m2846for(parcelableArrayList);
                }
                List<String> features = mediaRoute2Info.getFeatures();
                if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                    bundle.putBoolean("isDynamicGroupRoute", true);
                }
                if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK")) {
                    ArrayList<String> stringArrayList = extras2.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS");
                    if (stringArrayList == null || stringArrayList.isEmpty()) {
                        Log.w("MediaRouter2Utils", "Invalid feature of a group without members");
                    } else {
                        c10038l.m2839catch(stringArrayList);
                    }
                }
                return c10038l.m2840class();
            }
        }
        return null;
    }

    public static final Range purchase(InterfaceC5389l interfaceC5389l) {
        Float f;
        Float fValueOf = Float.valueOf(1.0f);
        try {
            Range range = (Range) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range == null) {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) C10160l.loadAd(((C10861l) interfaceC5389l).f21960l)) + '!');
                }
                return new Range(fValueOf, fValueOf);
            }
            float fFloatValue = ((Number) range.getLower()).floatValue();
            if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d && ((Number) range.getLower()).floatValue() >= 0.0f) {
                f = (Float) range.getLower();
            } else {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Invalid lower zoom range detected: " + range.getLower());
                }
                f = fValueOf;
            }
            float fFloatValue2 = ((Number) range.getUpper()).floatValue();
            if (Math.abs(fFloatValue2) >= ((double) Math.ulp(Math.abs(fFloatValue2))) * 2.0d && ((Number) range.getUpper()).floatValue() >= 0.0f) {
                fValueOf = (Float) range.getUpper();
            } else if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "Invalid upper zoom range detected: " + range.getUpper());
            }
            return new Range(f, fValueOf);
        } catch (AssertionError e) {
            if (AbstractC17919l.yandex(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
            }
            if (!AbstractC5088l.metrica()) {
                return null;
            }
            Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
            return null;
        }
    }

    public static boolean remoteconfig(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean smaato(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static void startapp(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        window.setDecorFitsSystemWindows(z);
    }

    public static String subs(InterfaceC0899l interfaceC0899l) {
        if (interfaceC0899l instanceof C1810l) {
            return "image/*";
        }
        if (interfaceC0899l instanceof C17924l) {
            return null;
        }
        C18725l.billing();
        return null;
    }

    public static void subscription(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void tapsense(Outline outline, C9902l c9902l) {
        if (c9902l instanceof C9902l) {
            outline.setPath(c9902l.yandex);
        } else {
            C10754l.ads("Unable to obtain android.graphics.Path");
        }
    }

    public static boolean vip(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static Context yandex(Context context, String str) {
        return context.createAttributionContext(str);
    }
}

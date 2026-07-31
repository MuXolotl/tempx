package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5917l {
    public static boolean Signature(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean ad(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static int adcel(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static float admob(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static int ads(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static final boolean advert(InterfaceC5389l interfaceC5389l) {
        int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
        return iArr != null && AbstractC8669l.tapsense(iArr, 1);
    }

    public static int amazon(C16328l c16328l, HandwritingGesture handwritingGesture) {
        C10178l c10178l = c16328l.yandex;
        InterfaceC13142l interfaceC13142l = c16328l.loadAd;
        c10178l.loadAd.yandex().premium();
        C2566l c2566l = c10178l.loadAd;
        c2566l.f5584l = null;
        c16328l.smaato(c2566l);
        C10178l.yandex(c10178l, interfaceC13142l, true, 1);
        c10178l.amazon(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        C16328l.admob(c16328l, fallbackText, false, 12);
        return 5;
    }

    public static int applovin(C17812l c17812l, HandwritingGesture handwritingGesture, C16173l c16173l, InterfaceC3114l interfaceC3114l, C16931l c16931l) {
        int i;
        C11224l c11224lAmazon;
        C11224l c11224lAmazon2;
        C3625l c3625l = c17812l.isPro;
        if (c3625l == null) {
            return 3;
        }
        C11224l c11224lAmazon3 = c17812l.amazon();
        if (!c3625l.equals(c11224lAmazon3 != null ? c11224lAmazon3.yandex.yandex.yandex : null)) {
            return 3;
        }
        boolean z = false;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jIsPro = AbstractC3058l.isPro(c17812l, AbstractC5833l.remoteconfig(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (C12814l.amazon(jIsPro)) {
                return purchase(selectGesture, c16931l);
            }
            c16931l.invoke(new C3363l((int) (jIsPro >> 32), (int) (jIsPro & 4294967295L)));
            if (c16173l != null) {
                c16173l.admob(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jIsPro2 = AbstractC3058l.isPro(c17812l, AbstractC5833l.remoteconfig(deleteGesture.getDeletionArea()), i2);
                if (C12814l.amazon(jIsPro2)) {
                    return purchase(deleteGesture, c16931l);
                }
                premium(jIsPro2, c3625l, i2 == 1, c16931l);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jCrashlytics = AbstractC3058l.crashlytics(c17812l, AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionStartArea()), AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (C12814l.amazon(jCrashlytics)) {
                        return purchase(deleteRangeGesture, c16931l);
                    }
                    premium(jCrashlytics, c3625l, i3 == 1, c16931l);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (interfaceC3114l == null) {
                        return purchase(joinOrSplitGesture, c16931l);
                    }
                    long jMopub = AbstractC3058l.mopub(joinOrSplitGesture.getJoinOrSplitPoint());
                    C11224l c11224lAmazon4 = c17812l.amazon();
                    int iSubs = c11224lAmazon4 != null ? AbstractC3058l.subs(c11224lAmazon4.yandex.loadAd, jMopub, c17812l.crashlytics(), interfaceC3114l) : -1;
                    if (iSubs == -1 || ((c11224lAmazon2 = c17812l.amazon()) != null && AbstractC3058l.purchase(c11224lAmazon2.yandex, iSubs))) {
                        return purchase(joinOrSplitGesture, c16931l);
                    }
                    long jBilling = AbstractC3058l.billing(c3625l, iSubs);
                    if (!C12814l.amazon(jBilling)) {
                        premium(jBilling, c3625l, false, c16931l);
                        return 1;
                    }
                    int i4 = (int) (jBilling >> 32);
                    c16931l.invoke(new C16349l(new InterfaceC3442l[]{new C3363l(i4, i4), new C0597l(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (interfaceC3114l == null) {
                        return purchase(insertGesture, c16931l);
                    }
                    long jMopub2 = AbstractC3058l.mopub(insertGesture.getInsertionPoint());
                    C11224l c11224lAmazon5 = c17812l.amazon();
                    int iSubs2 = c11224lAmazon5 != null ? AbstractC3058l.subs(c11224lAmazon5.yandex.loadAd, jMopub2, c17812l.crashlytics(), interfaceC3114l) : -1;
                    if (iSubs2 == -1 || ((c11224lAmazon = c17812l.amazon()) != null && AbstractC3058l.purchase(c11224lAmazon.yandex, iSubs2))) {
                        return purchase(insertGesture, c16931l);
                    }
                    c16931l.invoke(new C16349l(new InterfaceC3442l[]{new C3363l(iSubs2, iSubs2), new C0597l(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                C11224l c11224lAmazon6 = c17812l.amazon();
                long jLoadAd = AbstractC3058l.loadAd(c11224lAmazon6 != null ? c11224lAmazon6.yandex : null, AbstractC3058l.mopub(removeSpaceGesture.getStartPoint()), AbstractC3058l.mopub(removeSpaceGesture.getEndPoint()), c17812l.crashlytics(), interfaceC3114l);
                if (C12814l.amazon(jLoadAd)) {
                    return purchase(removeSpaceGesture, c16931l);
                }
                C9987l c9987l = new C9987l();
                c9987l.f20387l = -1;
                C9987l c9987l2 = new C9987l();
                c9987l2.f20387l = -1;
                String strPurchase = new C11155l("\\s+").purchase(AbstractC2296l.mopub(jLoadAd, c3625l), new C9300l(c9987l, c9987l2, z ? 1 : 0));
                int i5 = c9987l.f20387l;
                if (i5 == -1 || (i = c9987l2.f20387l) == -1) {
                    return purchase(removeSpaceGesture, c16931l);
                }
                int i6 = (int) (jLoadAd >> 32);
                c16931l.invoke(new C16349l(new InterfaceC3442l[]{new C3363l(i6 + i5, i6 + i), new C0597l(strPurchase.substring(i5, strPurchase.length() - (C12814l.purchase(jLoadAd) - c9987l2.f20387l)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jCrashlytics2 = AbstractC3058l.crashlytics(c17812l, AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionStartArea()), AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (C12814l.amazon(jCrashlytics2)) {
                return purchase(selectRangeGesture, c16931l);
            }
            c16931l.invoke(new C3363l((int) (jCrashlytics2 >> 32), (int) (jCrashlytics2 & 4294967295L)));
            if (c16173l != null) {
                c16173l.admob(true);
            }
        }
        return 1;
    }

    public static int appmetrica(C16328l c16328l, HandwritingGesture handwritingGesture, C10312l c10312l, Function0 function0, InterfaceC3114l interfaceC3114l) {
        int i;
        C0327l c0327lCrashlytics;
        int i2;
        int i3 = 1;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jFirebase = AbstractC3058l.firebase(c10312l, AbstractC5833l.remoteconfig(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (C12814l.amazon(jFirebase)) {
                return amazon(c16328l, selectGesture);
            }
            c16328l.isPro(jFirebase);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i2 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long jFirebase2 = AbstractC3058l.firebase(c10312l, AbstractC5833l.remoteconfig(deleteGesture.getDeletionArea()), i2);
                if (C12814l.amazon(jFirebase2)) {
                    return amazon(c16328l, deleteGesture);
                }
                if (i2 == 1) {
                    jFirebase2 = AbstractC3058l.yandex(jFirebase2, c16328l.amazon());
                }
                C16328l.subs(c16328l, "", jFirebase2, false, 12);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i2 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long jAmazon = AbstractC3058l.amazon(c10312l, AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionStartArea()), AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionEndArea()), i2);
                    if (C12814l.amazon(jAmazon)) {
                        return amazon(c16328l, deleteRangeGesture);
                    }
                    if (i2 == 1) {
                        jAmazon = AbstractC3058l.yandex(jAmazon, c16328l.amazon());
                    }
                    C16328l.subs(c16328l, "", jAmazon, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (c16328l.yandex.loadAd() != c16328l.yandex.loadAd()) {
                        return 3;
                    }
                    long jMopub = AbstractC3058l.mopub(joinOrSplitGesture.getJoinOrSplitPoint());
                    C0327l c0327lCrashlytics2 = c10312l.crashlytics();
                    int iSubs = c0327lCrashlytics2 != null ? AbstractC3058l.subs(c0327lCrashlytics2.loadAd, jMopub, c10312l.purchase(), interfaceC3114l) : -1;
                    if (iSubs == -1 || ((c0327lCrashlytics = c10312l.crashlytics()) != null && AbstractC3058l.purchase(c0327lCrashlytics, iSubs))) {
                        return amazon(c16328l, joinOrSplitGesture);
                    }
                    long jBilling = AbstractC3058l.billing(c16328l.amazon(), iSubs);
                    if (C12814l.amazon(jBilling)) {
                        C16328l.subs(c16328l, " ", jBilling, false, 12);
                        return 1;
                    }
                    C16328l.subs(c16328l, "", jBilling, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long jMopub2 = AbstractC3058l.mopub(insertGesture.getInsertionPoint());
                    C0327l c0327lCrashlytics3 = c10312l.crashlytics();
                    int iSubs2 = c0327lCrashlytics3 != null ? AbstractC3058l.subs(c0327lCrashlytics3.loadAd, jMopub2, c10312l.purchase(), interfaceC3114l) : -1;
                    if (iSubs2 == -1) {
                        return amazon(c16328l, insertGesture);
                    }
                    C16328l.subs(c16328l, insertGesture.getTextToInsert(), AbstractC2296l.loadAd(iSubs2, iSubs2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long jLoadAd = AbstractC3058l.loadAd(c10312l.crashlytics(), AbstractC3058l.mopub(removeSpaceGesture.getStartPoint()), AbstractC3058l.mopub(removeSpaceGesture.getEndPoint()), c10312l.purchase(), interfaceC3114l);
                if (C12814l.amazon(jLoadAd)) {
                    return amazon(c16328l, removeSpaceGesture);
                }
                C9987l c9987l = new C9987l();
                c9987l.f20387l = -1;
                C9987l c9987l2 = new C9987l();
                c9987l2.f20387l = -1;
                String strPurchase = new C11155l("\\s+").purchase(AbstractC2296l.mopub(jLoadAd, c16328l.amazon()), new C9300l(c9987l, c9987l2, i3));
                int i4 = c9987l.f20387l;
                if (i4 == -1 || (i = c9987l2.f20387l) == -1) {
                    return amazon(c16328l, removeSpaceGesture);
                }
                int i5 = (int) (jLoadAd >> 32);
                C16328l.subs(c16328l, strPurchase.substring(c9987l.f20387l, strPurchase.length() - (C12814l.purchase(jLoadAd) - c9987l2.f20387l)), AbstractC2296l.loadAd(i4 + i5, i5 + i), false, 12);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jAmazon2 = AbstractC3058l.amazon(c10312l, AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionStartArea()), AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (C12814l.amazon(jAmazon2)) {
                return amazon(c16328l, selectRangeGesture);
            }
            c16328l.isPro(jAmazon2);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return 1;
    }

    public static JobScheduler billing(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    public static Context crashlytics(Context context, int i) {
        return context.createDeviceContext(i);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final void m1866extends(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }

    public static Set firebase(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final void m1867for(LinkedHashMap linkedHashMap) {
        linkedHashMap.put(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
    }

    public static boolean inmobi(C17812l c17812l, PreviewableHandwritingGesture previewableHandwritingGesture, C16173l c16173l, CancellationSignal cancellationSignal) {
        C3625l c3625l = c17812l.isPro;
        if (c3625l != null) {
            C11224l c11224lAmazon = c17812l.amazon();
            if (c3625l.equals(c11224lAmazon != null ? c11224lAmazon.yandex.yandex.yandex : null)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                EnumC7170l enumC7170l = EnumC7170l.f15004l;
                int i = 1;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (c16173l != null) {
                        long jIsPro = AbstractC3058l.isPro(c17812l, AbstractC5833l.remoteconfig(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        C17812l c17812l2 = c16173l.amazon;
                        if (c17812l2 != null) {
                            c17812l2.billing(jIsPro);
                        }
                        C17812l c17812l3 = c16173l.amazon;
                        if (c17812l3 != null) {
                            c17812l3.purchase(C12814l.loadAd);
                        }
                        if (!C12814l.amazon(jIsPro)) {
                            c16173l.tapsense(false);
                            c16173l.adcel(enumC7170l);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (c16173l != null) {
                        long jIsPro2 = AbstractC3058l.isPro(c17812l, AbstractC5833l.remoteconfig(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        C17812l c17812l4 = c16173l.amazon;
                        if (c17812l4 != null) {
                            c17812l4.purchase(jIsPro2);
                        }
                        C17812l c17812l5 = c16173l.amazon;
                        if (c17812l5 != null) {
                            c17812l5.billing(C12814l.loadAd);
                        }
                        if (!C12814l.amazon(jIsPro2)) {
                            c16173l.tapsense(false);
                            c16173l.adcel(enumC7170l);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (c16173l != null) {
                        long jCrashlytics = AbstractC3058l.crashlytics(c17812l, AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionStartArea()), AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C17812l c17812l6 = c16173l.amazon;
                        if (c17812l6 != null) {
                            c17812l6.billing(jCrashlytics);
                        }
                        C17812l c17812l7 = c16173l.amazon;
                        if (c17812l7 != null) {
                            c17812l7.purchase(C12814l.loadAd);
                        }
                        if (!C12814l.amazon(jCrashlytics)) {
                            c16173l.tapsense(false);
                            c16173l.adcel(enumC7170l);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (c16173l != null) {
                        long jCrashlytics2 = AbstractC3058l.crashlytics(c17812l, AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionStartArea()), AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        C17812l c17812l8 = c16173l.amazon;
                        if (c17812l8 != null) {
                            c17812l8.purchase(jCrashlytics2);
                        }
                        C17812l c17812l9 = c16173l.amazon;
                        if (c17812l9 != null) {
                            c17812l9.billing(C12814l.loadAd);
                        }
                        if (!C12814l.amazon(jCrashlytics2)) {
                            c16173l.tapsense(false);
                            c16173l.adcel(enumC7170l);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C13857l(i, c16173l));
                }
                return true;
            }
        }
        return false;
    }

    public static CharSequence isPro(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static final ColorSpace isVip(AbstractC11833l abstractC11833l) {
        if (AbstractC8576l.yandex(abstractC11833l, C3955l.license)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC8576l.yandex(abstractC11833l, C3955l.pro)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    public static final boolean license(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }

    public static final void loadAd(CursorAnchorInfo.Builder builder, C0327l c0327l, C8896l c8896l) {
        if (c8896l.firebase()) {
            return;
        }
        C6222l c6222l = c0327l.loadAd;
        int i = c6222l.billing - 1;
        if (i < 0) {
            i = 0;
        }
        int iPurchase = AbstractC8576l.purchase(c6222l.purchase(c8896l.loadAd), 0, i);
        int iPurchase2 = AbstractC8576l.purchase(c6222l.purchase(c8896l.amazon), 0, i);
        if (iPurchase > iPurchase2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c0327l.mopub(iPurchase), c6222l.billing(iPurchase), c0327l.admob(iPurchase), c6222l.loadAd(iPurchase));
            if (iPurchase == iPurchase2) {
                return;
            } else {
                iPurchase++;
            }
        }
    }

    public static float metrica(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingGestureLineMargin();
    }

    public static AccessibilityNodeInfo.AccessibilityAction mopub() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static void m1868native(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m1869package(PendingIntent pendingIntent) {
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (Build.VERSION.SDK_INT >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void premium(long j, C3625l c3625l, boolean z, C16931l c16931l) {
        if (z) {
            j = AbstractC3058l.yandex(j, c3625l);
        }
        int i = (int) (4294967295L & j);
        c16931l.invoke(new C16349l(new InterfaceC3442l[]{new C3363l(i, i), new C12066l(C12814l.purchase(j), 0)}));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static void m1870private(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static final boolean pro(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    public static int purchase(HandwritingGesture handwritingGesture, C16931l c16931l) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c16931l.invoke(new C0597l(fallbackText, 1));
        return 5;
    }

    public static int remoteconfig(Context context) {
        return context.getDeviceId();
    }

    public static final void signatures(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        captureCallback.onReadoutStarted(cameraCaptureSession, captureRequest, j, j2);
    }

    public static int smaato(Context context) {
        return context.getDeviceId();
    }

    public static float startapp(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHandwritingSlop();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static void m1871strictfp(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void subs(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static int subscription(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static void m1872synchronized(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void tapsense(C16328l c16328l, long j, int i) {
        if (C12814l.amazon(j)) {
            C10178l c10178l = c16328l.yandex;
            InterfaceC13142l interfaceC13142l = c16328l.loadAd;
            c10178l.loadAd.yandex().premium();
            C2566l c2566l = c10178l.loadAd;
            c2566l.f5584l = null;
            c16328l.smaato(c2566l);
            C10178l.yandex(c10178l, interfaceC13142l, true, 1);
            c10178l.amazon(true);
            return;
        }
        long jPurchase = c16328l.purchase(j);
        C10178l c10178l2 = c16328l.yandex;
        InterfaceC13142l interfaceC13142l2 = c16328l.loadAd;
        c10178l2.loadAd.yandex().premium();
        C2566l c2566l2 = c10178l2.loadAd;
        int i2 = (int) (jPurchase >> 32);
        int i3 = (int) (jPurchase & 4294967295L);
        C13545l c13545l = c2566l2.f5577l;
        if (i2 >= i3) {
            C8339l.metrica(AbstractC12589l.premium(i2, i3, "Do not set reversed or empty range: ", " > "));
            return;
        }
        c2566l2.f5584l = new C8195l(new C9058l(i), new C12814l(AbstractC2296l.loadAd(AbstractC8576l.purchase(i2, 0, c13545l.length()), AbstractC8576l.purchase(i3, 0, c13545l.length()))));
        C10178l.yandex(c10178l2, interfaceC13142l2, true, 1);
        c10178l2.amazon(true);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static RouteListingPreference m1873throw(C1536l c1536l) {
        ArrayList arrayList = new ArrayList();
        for (C4126l c4126l : c1536l.yandex) {
            arrayList.add(new RouteListingPreference.Item.Builder(c4126l.yandex).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(c4126l.loadAd).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(c1536l.loadAd).build();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static boolean m1874throws(C16328l c16328l, PreviewableHandwritingGesture previewableHandwritingGesture, C10312l c10312l, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            tapsense(c16328l, AbstractC3058l.firebase(c10312l, AbstractC5833l.remoteconfig(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            tapsense(c16328l, AbstractC3058l.firebase(c10312l, AbstractC5833l.remoteconfig(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            tapsense(c16328l, AbstractC3058l.amazon(c10312l, AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionStartArea()), AbstractC5833l.remoteconfig(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            tapsense(c16328l, AbstractC3058l.amazon(c10312l, AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionStartArea()), AbstractC5833l.remoteconfig(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new C13857l(2, c16328l));
        }
        return true;
    }

    public static int[] vip(C18118l c18118l, RectF rectF, int i, final C15707l c15707l) {
        return c18118l.billing.getRangeForRect(rectF, i == 1 ? new C8754l(new C0848l(c18118l.billing.getText(), c18118l.smaato(), 3)) : new GraphemeClusterSegmentFinder(c18118l.billing.getText(), c18118l.yandex), new Layout.TextInclusionStrategy() { // from class: lٗۗؔ
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) c15707l.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static void m1875volatile(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(AbstractC14055l.remoteconfig(SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class));
        editorInfo.setSupportedHandwritingGesturePreviews(AbstractC8669l.m2407import(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static final void yandex(CursorAnchorInfo.Builder builder, C0327l c0327l, C8896l c8896l) {
        if (c8896l.firebase()) {
            return;
        }
        C6222l c6222l = c0327l.loadAd;
        int i = c6222l.billing - 1;
        if (i < 0) {
            i = 0;
        }
        int iPurchase = AbstractC8576l.purchase(c6222l.purchase(c8896l.loadAd), 0, i);
        int iPurchase2 = AbstractC8576l.purchase(c6222l.purchase(c8896l.amazon), 0, i);
        if (iPurchase > iPurchase2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(c0327l.mopub(iPurchase), c6222l.billing(iPurchase), c0327l.admob(iPurchase), c6222l.loadAd(iPurchase));
            if (iPurchase == iPurchase2) {
                return;
            } else {
                iPurchase++;
            }
        }
    }
}

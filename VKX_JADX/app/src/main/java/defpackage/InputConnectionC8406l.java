package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;

/* JADX INFO: renamed from: lًۦؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC8406l implements InputConnection {
    public int admob;
    public final C16173l amazon;
    public int billing;
    public final C17812l crashlytics;
    public final boolean loadAd;
    public C0639l mopub;
    public final InterfaceC3114l purchase;
    public boolean subs;
    public final C3585l yandex;
    public final ArrayList isPro = new ArrayList();
    public boolean firebase = true;

    public InputConnectionC8406l(C0639l c0639l, C3585l c3585l, boolean z, C17812l c17812l, C16173l c16173l, InterfaceC3114l interfaceC3114l) {
        this.yandex = c3585l;
        this.loadAd = z;
        this.crashlytics = c17812l;
        this.amazon = c16173l;
        this.purchase = interfaceC3114l;
        this.mopub = c0639l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        this.billing++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.firebase;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.isPro.clear();
        this.billing = 0;
        this.firebase = false;
        ArrayList arrayList = ((C10585l) this.yandex.f7511l).isPro;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC8576l.yandex(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.firebase;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.firebase;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.firebase;
        return z ? this.loadAd : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.firebase;
        if (z) {
            yandex(new C0597l(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void crashlytics(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        yandex(new C12066l(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        yandex(new C16953l(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return loadAd();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        yandex(new C2680l());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C0639l c0639l = this.mopub;
        return TextUtils.getCapsMode(c0639l.yandex.f7563l, C12814l.mopub(c0639l.loadAd), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.subs = z;
        if (z) {
            this.admob = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC11174l.loadAd(this.mopub);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12814l.amazon(this.mopub.loadAd)) {
            return null;
        }
        return AbstractC15439l.crashlytics(this.mopub).f7563l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC15439l.amazon(this.mopub, i).f7563l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC15439l.purchase(this.mopub, i).f7563l;
    }

    public final boolean loadAd() {
        int i = this.billing - 1;
        this.billing = i;
        if (i == 0) {
            ArrayList arrayList = this.isPro;
            if (!arrayList.isEmpty()) {
                ((C10585l) this.yandex.f7511l).crashlytics.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.billing > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.firebase;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    yandex(new C3363l(0, this.mopub.yandex.f7563l.length()));
                    break;
                case R.id.cut:
                    crashlytics(277);
                    return false;
                case R.id.copy:
                    crashlytics(278);
                    return false;
                case R.id.paste:
                    crashlytics(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.firebase;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((C10585l) this.yandex.f7511l).amazon.invoke(new C14694l(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C16931l c16931l = new C16931l(8, this);
            C17812l c17812l = this.crashlytics;
            int iApplovin = c17812l != null ? AbstractC5917l.applovin(c17812l, handwritingGesture, this.amazon, this.purchase, c16931l) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC14516l(intConsumer, iApplovin, 0));
            } else {
                intConsumer.accept(iApplovin);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.firebase;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C17812l c17812l;
        if (Build.VERSION.SDK_INT < 34 || (c17812l = this.crashlytics) == null) {
            return false;
        }
        return AbstractC5917l.inmobi(c17812l, previewableHandwritingGesture, this.amazon, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C8355l c8355l;
        boolean z4 = this.firebase;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            c8355l = ((C10585l) this.yandex.f7511l).remoteconfig;
            synchronized (c8355l.crashlytics) {
                try {
                    c8355l.billing = z2;
                    c8355l.mopub = z3;
                    c8355l.admob = z5;
                    c8355l.subs = z;
                    if (z6) {
                        c8355l.purchase = true;
                        if (c8355l.isPro != null) {
                            c8355l.yandex();
                        }
                    }
                    c8355l.amazon = z7;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c8355l = ((C10585l) this.yandex.f7511l).remoteconfig;
        synchronized (c8355l.crashlytics) {
            c8355l.billing = z2;
            c8355l.mopub = z3;
            c8355l.admob = z5;
            c8355l.subs = z;
            if (z6) {
                c8355l.purchase = true;
                if (c8355l.isPro != null) {
                    c8355l.yandex();
                }
            }
            c8355l.amazon = z7;
            Unit unit2 = Unit.INSTANCE;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C10585l) this.yandex.f7511l).firebase.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.firebase;
        if (z) {
            yandex(new C11645l(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.firebase;
        if (z) {
            yandex(new C6163l(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.firebase;
        if (!z) {
            return z;
        }
        yandex(new C3363l(i, i2));
        return true;
    }

    public final void yandex(InterfaceC3442l interfaceC3442l) {
        this.billing++;
        try {
            this.isPro.add(interfaceC3442l);
        } finally {
            loadAd();
        }
    }
}

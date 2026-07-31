package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC17176l implements InputConnection {
    public C0639l amazon;
    public boolean billing;
    public int crashlytics;
    public final boolean loadAd;
    public int purchase;
    public final C16543l yandex;
    public final ArrayList mopub = new ArrayList();
    public boolean admob = true;

    public InputConnectionC17176l(C0639l c0639l, C16543l c16543l, boolean z) {
        this.yandex = c16543l;
        this.loadAd = z;
        this.amazon = c0639l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.admob;
        if (!z) {
            return z;
        }
        this.crashlytics++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.admob;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.mopub.clear();
        this.crashlytics = 0;
        this.admob = false;
        ArrayList arrayList = ((C8483l) this.yandex.f32482l).subs;
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
        boolean z = this.admob;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.admob;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.admob;
        return z ? this.loadAd : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.admob;
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
        boolean z = this.admob;
        if (!z) {
            return z;
        }
        yandex(new C12066l(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.admob;
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
        boolean z = this.admob;
        if (!z) {
            return z;
        }
        yandex(new C2680l());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C0639l c0639l = this.amazon;
        return TextUtils.getCapsMode(c0639l.yandex.f7563l, C12814l.mopub(c0639l.loadAd), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.billing = z;
        if (z) {
            this.purchase = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC10547l.amazon(this.amazon);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12814l.amazon(this.amazon.loadAd)) {
            return null;
        }
        return AbstractC15439l.crashlytics(this.amazon).f7563l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC15439l.amazon(this.amazon, i).f7563l;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC15439l.purchase(this.amazon, i).f7563l;
    }

    public final boolean loadAd() {
        int i = this.crashlytics - 1;
        this.crashlytics = i;
        if (i == 0) {
            ArrayList arrayList = this.mopub;
            if (!arrayList.isEmpty()) {
                ((C8483l) this.yandex.f32482l).purchase.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.crashlytics > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.admob;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    yandex(new C3363l(0, this.amazon.yandex.f7563l.length()));
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
        boolean z = this.admob;
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
            ((C8483l) this.yandex.f32482l).billing.invoke(new C14694l(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.admob;
        if (z) {
            return true;
        }
        return z;
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
        C18310l c18310l;
        boolean z4 = this.admob;
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
            c18310l = ((C8483l) this.yandex.f32482l).smaato;
            synchronized (c18310l.crashlytics) {
                try {
                    c18310l.billing = z2;
                    c18310l.mopub = z3;
                    c18310l.admob = z5;
                    c18310l.subs = z;
                    if (z6) {
                        c18310l.purchase = true;
                        if (c18310l.isPro != null) {
                            c18310l.yandex();
                        }
                    }
                    c18310l.amazon = z7;
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
        c18310l = ((C8483l) this.yandex.f32482l).smaato;
        synchronized (c18310l.crashlytics) {
            c18310l.billing = z2;
            c18310l.mopub = z3;
            c18310l.admob = z5;
            c18310l.subs = z;
            if (z6) {
                c18310l.purchase = true;
                if (c18310l.isPro != null) {
                    c18310l.yandex();
                }
            }
            c18310l.amazon = z7;
            Unit unit2 = Unit.INSTANCE;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.admob;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C8483l) this.yandex.f32482l).isPro.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.admob;
        if (z) {
            yandex(new C11645l(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.admob;
        if (z) {
            yandex(new C6163l(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.admob;
        if (!z) {
            return z;
        }
        yandex(new C3363l(i, i2));
        return true;
    }

    public final void yandex(InterfaceC3442l interfaceC3442l) {
        this.crashlytics++;
        try {
            this.mopub.add(interfaceC3442l);
        } finally {
            loadAd();
        }
    }
}

package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC12817l implements InputConnection {
    public final InputConnection crashlytics;
    public final C17893l loadAd = new C17893l(0, new Function1[16]);
    public final C18289l yandex;

    public InputConnectionC12817l(C18289l c18289l, EditorInfo editorInfo) {
        this.yandex = c18289l;
        this.crashlytics = AbstractC2749l.loadAd(new C7749l(this, false), editorInfo, new C16936l(this));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((C17219l) this.yandex.loadAd).f33424l++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.loadAd.isPro();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return AbstractC0170l.yandex(this.crashlytics, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.yandex.mopub(new C5568l(charSequence.toString(), i, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C18289l c18289l = this.yandex;
        c18289l.mopub(new C13678l(i, i2, c18289l, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        this.yandex.mopub(new Function1() { // from class: lّۙ٘
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C2566l c2566l = (C2566l) obj;
                int i3 = i;
                int i4 = i2;
                if (i3 < 0 || i4 < 0) {
                    AbstractC14825l.yandex("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.");
                }
                int iMopub = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iMopub + 1;
                    long j = c2566l.f5585l;
                    C13545l c13545l = c2566l.f5577l;
                    int iMopub2 = C12814l.mopub(j);
                    long j2 = c2566l.f5585l;
                    if (iMopub2 <= i6) {
                        iMopub = C12814l.mopub(j2);
                        break;
                    }
                    iMopub = (Character.isHighSurrogate(c13545l.charAt((C12814l.mopub(j2) - i6) + (-1))) && Character.isLowSurrogate(c13545l.charAt(C12814l.mopub(c2566l.f5585l) - i6))) ? iMopub + 2 : i6;
                }
                int length = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = length + 1;
                    long j3 = c2566l.f5585l;
                    C13545l c13545l2 = c2566l.f5577l;
                    if (C12814l.billing(j3) + i8 >= c13545l2.length()) {
                        length = c13545l2.length() - C12814l.billing(c2566l.f5585l);
                        break;
                    }
                    length = (Character.isHighSurrogate(c13545l2.charAt((C12814l.billing(c2566l.f5585l) + i8) + (-1))) && Character.isLowSurrogate(c13545l2.charAt(C12814l.billing(c2566l.f5585l) + i8))) ? length + 2 : i8;
                }
                AbstractC12272l.purchase(c2566l, C12814l.billing(c2566l.f5585l), C12814l.billing(c2566l.f5585l) + length);
                AbstractC12272l.purchase(c2566l, C12814l.mopub(c2566l.f5585l) - iMopub, C12814l.mopub(c2566l.f5585l));
                return Unit.INSTANCE;
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((C17219l) this.yandex.loadAd).advert();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.yandex.mopub(new C17049l(28));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(yandex(), C12814l.mopub(yandex().f12061l), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        C5667l c5667lYandex = yandex();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c5667lYandex;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c5667lYandex.f12057l.length();
        extractedText.partialStartOffset = -1;
        long j = c5667lYandex.f12061l;
        extractedText.selectionStart = C12814l.mopub(j);
        extractedText.selectionEnd = C12814l.billing(j);
        extractedText.flags = !AbstractC12024l.inmobi(c5667lYandex, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12814l.amazon(yandex().f12061l)) {
            return null;
        }
        C5667l c5667lYandex = yandex();
        return c5667lYandex.f12057l.subSequence(C12814l.mopub(c5667lYandex.f12061l), C12814l.billing(c5667lYandex.f12061l)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        C5667l c5667lYandex = yandex();
        long j = c5667lYandex.f12061l;
        CharSequence charSequence = c5667lYandex.f12057l;
        int iBilling = C12814l.billing(j);
        int iBilling2 = C12814l.billing(c5667lYandex.f12061l);
        int length = iBilling2 + i;
        if (((iBilling2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iBilling, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        C5667l c5667lYandex = yandex();
        int iMopub = C12814l.mopub(c5667lYandex.f12061l);
        int i3 = iMopub - i;
        if (((i ^ iMopub) & (iMopub ^ i3)) < 0) {
            i3 = 0;
        }
        return c5667lYandex.f12057l.subSequence(Math.max(0, i3), C12814l.mopub(c5667lYandex.f12061l)).toString();
    }

    public final void loadAd(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2 = 0;
        switch (i) {
            case R.id.selectAll:
                int length = yandex().f12057l.length();
                C18289l c18289l = this.yandex;
                c18289l.mopub(new C13678l(c18289l, i2, length, i2));
                break;
            case R.id.cut:
                loadAd(277);
                break;
            case R.id.copy:
                loadAd(278);
                break;
            case R.id.paste:
                loadAd(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
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
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        Function1 function1 = (Function1) this.yandex.billing;
        if (function1 != null) {
            function1.invoke(new C14694l(i2));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iAppmetrica;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i >= 34) {
            C18289l c18289l = this.yandex;
            iAppmetrica = AbstractC5917l.appmetrica((C16328l) c18289l.amazon, handwritingGesture, (C10312l) c18289l.subs, (Function0) c18289l.isPro, (InterfaceC3114l) c18289l.firebase);
        } else {
            iAppmetrica = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC14516l(intConsumer, iAppmetrica, 1));
        } else {
            intConsumer.accept(iAppmetrica);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.crashlytics.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        C18289l c18289l = this.yandex;
        return AbstractC5917l.m1874throws((C16328l) c18289l.amazon, previewableHandwritingGesture, (C10312l) c18289l.subs, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C7504l c7504l;
        InterfaceC14029l interfaceC14029l;
        CursorAnchorInfo cursorAnchorInfoYandex;
        C5719l c5719l = (C5719l) this.yandex.admob;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            c5719l.billing = z2;
            c5719l.mopub = z3;
            c5719l.admob = z4;
            c5719l.subs = z;
            if (z5 && (cursorAnchorInfoYandex = c5719l.yandex()) != null) {
                C0554l c0554l = c5719l.crashlytics;
                c0554l.m629case().updateCursorAnchorInfo((View) c0554l.f1958l, cursorAnchorInfoYandex);
            }
            c7504l = c5719l.purchase;
            interfaceC14029l = null;
            if (!z6) {
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c5719l.purchase = null;
                return true;
            }
            if (c7504l == null && c7504l.mopub()) {
                return true;
            }
            c5719l.purchase = AbstractC10999l.mopub(c5719l.amazon, null, 4, new C11039l(c5719l, interfaceC14029l, 19), 1);
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c5719l.billing = z2;
        c5719l.mopub = z3;
        c5719l.admob = z4;
        c5719l.subs = z;
        if (z5) {
            C0554l c0554l2 = c5719l.crashlytics;
            c0554l2.m629case().updateCursorAnchorInfo((View) c0554l2.f1958l, cursorAnchorInfoYandex);
        }
        c7504l = c5719l.purchase;
        interfaceC14029l = null;
        if (!z6) {
            if (c7504l == null) {
            }
            c5719l.purchase = AbstractC10999l.mopub(c5719l.amazon, null, 4, new C11039l(c5719l, interfaceC14029l, 19), 1);
            return true;
        }
        if (c7504l != null) {
            c7504l.ads(null);
        }
        c5719l.purchase = null;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        ((C0554l) this.yandex.purchase).mo641switch(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C18289l c18289l = this.yandex;
        c18289l.mopub(new C13678l(i, i2, c18289l, 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C14264l c14264l;
        AbstractC17569l c6359l;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        int i2 = 3;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    c14264l = new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, AbstractC12953l.loadAd(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    c14264l = new C14264l(AbstractC12953l.loadAd(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    c14264l = new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C9867l.amazon, null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        c14264l = new C14264l(0L, 0L, C6886l.f14424l, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                    } else if (style == 2) {
                        c14264l = new C14264l(0L, 0L, null, new C11617l(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                    } else if (style != 3) {
                        c14264l = null;
                    } else {
                        c14264l = new C14264l(0L, 0L, C6886l.f14424l, new C11617l(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (AbstractC8576l.yandex(family, "cursive")) {
                        c6359l = AbstractC17569l.f34195l;
                    } else if (AbstractC8576l.yandex(family, "monospace")) {
                        c6359l = AbstractC17569l.f34196l;
                    } else if (AbstractC8576l.yandex(family, "sans-serif")) {
                        c6359l = AbstractC17569l.f34193l;
                    } else if (AbstractC8576l.yandex(family, "serif")) {
                        c6359l = AbstractC17569l.f34192l;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            c6359l = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (AbstractC8576l.yandex(typefaceCreate, typeface) || AbstractC8576l.yandex(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                c6359l = new C6359l(new C13161l(typefaceCreate));
                            } else {
                                c6359l = null;
                            }
                        }
                    }
                    c14264l = new C14264l(0L, 0L, null, null, null, c6359l, null, 0L, null, null, null, 0L, null, null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    c14264l = new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C9867l.crashlytics, null, 61439);
                } else {
                    c14264l = null;
                }
                if (c14264l != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new C15012l(c14264l, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
                }
            }
            arrayList = arrayList2;
        }
        this.yandex.mopub(new C8608l(string, arrayList, i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        C18289l c18289l = this.yandex;
        c18289l.mopub(new C13678l(c18289l, i, i2, 0));
        ((Function1) c18289l.mopub).invoke(Boolean.FALSE);
        return true;
    }

    public final C5667l yandex() {
        return ((C16328l) this.yandex.amazon).amazon();
    }
}

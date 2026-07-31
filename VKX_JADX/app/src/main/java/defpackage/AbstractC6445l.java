package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: lؙٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6445l {
    public static boolean loadAd(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC4326l c17240l;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c17240l = new C17240l(clipData, 3);
        } else {
            C2534l c2534l = new C2534l();
            c2534l.loadAd = clipData;
            c2534l.crashlytics = 3;
            c17240l = c2534l;
        }
        AbstractC15872l.isPro(view, c17240l.build());
        return true;
    }

    public static boolean yandex(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC4326l c17240l;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c17240l = new C17240l(clipData, 3);
            } else {
                C2534l c2534l = new C2534l();
                c2534l.loadAd = clipData;
                c2534l.crashlytics = 3;
                c17240l = c2534l;
            }
            AbstractC15872l.isPro(textView, c17240l.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }
}

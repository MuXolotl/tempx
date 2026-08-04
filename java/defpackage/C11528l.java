package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11528l implements InterfaceC13515l {
    public final C10537l amazon;
    public TextClassifier billing;
    public final EnumC16103l crashlytics;
    public final Context loadAd;
    public final InterfaceC12932l yandex;
    public final C4910l purchase = AbstractC8618l.yandex();
    public final C10086l mopub = AbstractC8020l.smaato(null);
    public final Object admob = new Object();

    public C11528l(InterfaceC12932l interfaceC12932l, Context context, EnumC16103l enumC16103l, C10537l c10537l) {
        this.yandex = interfaceC12932l;
        this.loadAd = context;
        this.crashlytics = enumC16103l;
        this.amazon = c10537l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
    
        if (r11 == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object yandex(defpackage.C11528l r10, java.lang.CharSequence r11, long r12, android.view.textclassifier.TextClassifier r14, defpackage.AbstractC0283l r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11528l.yandex(lُۨۡ, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, lّؑۧ):java.lang.Object");
    }

    public final LocaleList amazon() {
        C10537l c10537l = this.amazon;
        if (c10537l == null) {
            AbstractC14238l.Signature();
            return AbstractC14238l.amazon(new Locale[]{AbstractC4189l.yandex.mo3369default().amazon().yandex});
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10537l, 10));
        Iterator it = c10537l.f21449l.iterator();
        while (it.hasNext()) {
            arrayList.add(((C9293l) it.next()).yandex);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return AbstractC14238l.amazon((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object billing(CharSequence charSequence, long j, AbstractC5563l abstractC5563l) {
        if (charSequence.length() == 0 || C12814l.amazon(j)) {
            return null;
        }
        return AbstractC10999l.firebase(this.yandex, new C14325l(this, new C10337l(j, null, this, charSequence), null), abstractC5563l);
    }

    public final C18436l crashlytics(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            RemoteAction remoteActionYandex = C18073l.yandex(remoteAction);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionYandex.shouldShowIcon()) {
                remoteAction = null;
            }
            RemoteAction remoteActionYandex2 = C18073l.yandex(remoteAction);
            if (remoteActionYandex2 != null && (icon = remoteActionYandex2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.loadAd);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new C18436l(charSequence, j, textClassification, arrayList);
    }

    public final void loadAd(C18624l c18624l, CharSequence charSequence, long j, Function1 function1) {
        C4910l c4910l = this.purchase;
        C18436l c18436l = null;
        if (c4910l.mopub()) {
            C18436l c18436l2 = (C18436l) this.mopub.getValue();
            if (c18436l2 == null || !C12814l.crashlytics(j, c18436l2.loadAd) || !AbstractC8576l.yandex(charSequence, c18436l2.yandex)) {
                c18436l2 = null;
            }
            c4910l.billing(null);
            c18436l = c18436l2;
        }
        if (c18436l == null) {
            function1.invoke(c18624l);
            return;
        }
        ArrayList arrayList = c18436l.amazon;
        TextClassification textClassification = c18436l.crashlytics;
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.admob;
        if (!zIsEmpty) {
            c18624l.yandex.yandex(new C8765l(obj, textClassification, 0, (Drawable) arrayList.get(0)));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            c18624l.yandex.yandex(new C8765l(obj, textClassification, -1, textClassification.getIcon()));
        }
        function1.invoke(c18624l);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            C18073l.yandex(actions.get(i));
            if (i > 0) {
                c18624l.yandex.yandex(new C8765l(obj, textClassification, i, (Drawable) arrayList.get(i)));
            }
        }
    }

    public final Object purchase(CharSequence charSequence, long j, AbstractC5563l abstractC5563l) {
        if (charSequence.length() == 0 || C12814l.amazon(j)) {
            return Unit.INSTANCE;
        }
        return AbstractC10999l.firebase(this.yandex, new C14325l(this, new C11150l(j, null, this, charSequence), null), abstractC5563l);
    }
}

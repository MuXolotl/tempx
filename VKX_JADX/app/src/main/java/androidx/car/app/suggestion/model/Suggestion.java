package androidx.car.app.suggestion.model;

import android.app.PendingIntent;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.AbstractC18531l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class Suggestion {
    private final PendingIntent mAction;
    private final CarIcon mIcon;
    private final String mIdentifier;
    private final CarText mSubtitle;
    private final CarText mTitle;

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    public PendingIntent getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    public String toString() {
        return "[id: " + this.mIdentifier + ", title: " + CarText.toShortString(this.mTitle) + ", subtitle: " + CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    public Suggestion(AbstractC18531l abstractC18531l) {
        throw null;
    }
}

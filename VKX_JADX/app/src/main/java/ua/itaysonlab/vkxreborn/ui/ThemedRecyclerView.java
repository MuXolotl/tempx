package ua.itaysonlab.vkxreborn.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC1753l;
import defpackage.C14889l;
import defpackage.InterfaceC8959l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lua/itaysonlab/vkxreborn/ui/ThemedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Llٌْٟ;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setTheme", "()V", "refreshTheme", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemedRecyclerView extends RecyclerView implements InterfaceC8959l {
    public static final int $stable = 8;

    public /* synthetic */ ThemedRecyclerView(Context context, AttributeSet attributeSet, int i, AbstractC1753l abstractC1753l) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void setTheme() {
        setEdgeEffectFactory(new C14889l());
    }

    @Override // defpackage.InterfaceC8959l
    public void refreshTheme() {
        setTheme();
    }

    public ThemedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTheme();
    }

    public ThemedRecyclerView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
